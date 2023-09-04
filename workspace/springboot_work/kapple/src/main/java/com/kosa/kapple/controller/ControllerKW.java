package com.kosa.kapple.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.kosa.kapple.domain.ProposalVO;
import com.kosa.kapple.domain.SupplierVO;
import com.kosa.kapple.service.ServiceKW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerKW {

    @Autowired
    private ServiceKW service;

    @GetMapping("comparsionSupplier/{compo_name}")
    public MappingJacksonValue selectedSuppl(@PathVariable String compo_name){
        List<SupplierVO> suppliers=service.allSuppl(compo_name);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter
                .filterOutAllExcept("suppl_no","suppl_name","ceo_name","category");
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("Supplier",filter);

        MappingJacksonValue mapping = new MappingJacksonValue(suppliers);
        mapping.setFilters(filterProvider);
        return mapping;
    }
//    @GetMapping("/proposal/{compo_name}/{suppl_no}")
//    public MappingJacksonValue getProposal(@PathVariable String compo_name,@PathVariable String suppl_no){
//        ProposalVO proposal=service.getProposal(compo_name,suppl_no);
//        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter
//                .filterOutAllExcept("suppl_name");
//        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("SupplInfo",filter);
//        MappingJacksonValue mapping = new MappingJacksonValue(proposal);
//        mapping.setFilters(filterProvider);
//        return mapping;
//    }
@GetMapping("/proposal/{compo_name}/{suppl_no}")
public ResponseEntity<String> getProposal(@PathVariable String compo_name, @PathVariable String suppl_no){
    ProposalVO proposal=service.getProposal(compo_name,suppl_no);
    SimpleBeanPropertyFilter supplFilter = SimpleBeanPropertyFilter.filterOutAllExcept("suppl_name");
    SimpleBeanPropertyFilter compFilter = SimpleBeanPropertyFilter.filterOutAllExcept("compo_name");
    SimpleBeanPropertyFilter proFilter = SimpleBeanPropertyFilter.filterOutAllExcept(
            "proposal_no", "price", "quantity", "defective_rate","quality_grade","prod_period");
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.setFilterProvider(new SimpleFilterProvider()
            .addFilter("Supplier", supplFilter)
            .addFilter("Component",compFilter)
            .addFilter("Proposal", proFilter));
    try {
            String json = objectMapper.writeValueAsString(proposal);
            return ResponseEntity.ok(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error while processing JSON");
        }


    }

}
