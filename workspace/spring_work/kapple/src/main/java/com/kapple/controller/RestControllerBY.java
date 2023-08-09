package com.kapple.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kapple.domain.SupplDraftVO;
import com.kapple.domain.SupplFileVO;
import com.kapple.domain.SupplLogoVO;
import com.kapple.request.addSupplierRequest;
import com.kapple.service.ServiceBY;

import lombok.extern.log4j.Log4j;

@Log4j
@RestController
@RequestMapping("/addSupplier")
public class RestControllerBY {

	@Autowired
	private ServiceBY service;
	
	@PostMapping("/register")
    public ResponseEntity<Map<String, Object>> registerSupplierAndProposal(@RequestBody addSupplierRequest request) {
        try {
        	
        	Map<String, Object> responseMap = new HashMap<>();
            responseMap.put("message", "Success");
            responseMap.put("supplier", request.getSupplier()); 
            responseMap.put("proposal", request.getProposal()); 
            responseMap.put("proposal", request.getLogo_uuid()); 
            responseMap.put("proposal", request.getFile_uuid()); 
            
            service.registerSupplierAndProposal(request);

            return ResponseEntity.ok(responseMap);
        } catch (Exception e) {
        	log.error("Error occurred in registerSupplierAndProposal.", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.singletonMap("error", "Error occurred"));
        }
    }
	
	@PostMapping("/draft")
    public ResponseEntity<Map<String, Object>> registerSupplierDraft(@RequestBody SupplDraftVO request) {
        try {
        	
        	Map<String, Object> responseMap = new HashMap<>();
            responseMap.put("message", "Success");
            responseMap.put("supplDraft", request); 
            
            service.registerSupplDraft(request);

            return ResponseEntity.ok(responseMap);
        } catch (Exception e) {
        	log.error("Error occurred in registerSupplierAndProposal.", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.singletonMap("error", "Error occurred"));
        }
    }
	
	@GetMapping("/getDraft")
	public List<SupplDraftVO> getSupplierDraft() {
	    return service.getSupplDraftList();
	}
	
	@PostMapping("/logo")
    public ResponseEntity<Map<String, Object>> registerSupplierLogo(@RequestBody SupplLogoVO request) {
        try {
        	
        	Map<String, Object> responseMap = new HashMap<>();
            responseMap.put("message", "Success");
            responseMap.put("supplLogo", request); 
            
            service.registerSupplLogo(request);

            return ResponseEntity.ok(responseMap);
        } catch (Exception e) {
        	log.error("Error occurred in registerSupplierAndProposal.", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.singletonMap("error", "Error occurred"));
        }
    }
	
	@PostMapping("/file")
    public ResponseEntity<Map<String, Object>> registerSupplierFile(@RequestBody SupplFileVO request) {
        try {
        	
        	Map<String, Object> responseMap = new HashMap<>();
            responseMap.put("message", "Success");
            responseMap.put("supplLogo", request); 
            
            service.registerSupplFile(request);

            return ResponseEntity.ok(responseMap);
        } catch (Exception e) {
        	log.error("Error occurred in registerSupplierAndProposal.", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.singletonMap("error", "Error occurred"));
        }
    }
	
}
