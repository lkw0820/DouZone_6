package com.kapple.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kapple.domain.EmpVO;
import com.kapple.domain.ProposalVO;
import com.kapple.domain.RetailerDTO;
import com.kapple.domain.RetailerDetailVO;
import com.kapple.domain.SalePredictVO;
import com.kapple.domain.SupplierDTO;
import com.kapple.domain.SupplierDetailVO;
import com.kapple.service.ServiceKW;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
//@RequestMapping("")
public class ControllerKW {

	@Autowired
	private ServiceKW service;
	@Autowired
    private PasswordEncoder passwordEncoder;
	//@Autowired
    //private AuthenticationManager authenticationManager;
	
	 @GetMapping("/comparsionSupplier/{compo_name}") 
	 public ResponseEntity<SupplierDTO> comparsionSupplier(@PathVariable("compo_name") String compo_name) { 
		 log.info("supplierList...........");
		 
		 SupplierDTO dto=new SupplierDTO(service.supplierListService(compo_name),compo_name,service.supplierCount(compo_name),service.componentDetail(compo_name));
		 return new ResponseEntity<SupplierDTO>(dto,HttpStatus.OK);
	 }
	 

	
	@GetMapping("/modal/{suppl_no}")
	public ResponseEntity<SupplierDetailVO> supplierDetail(@PathVariable("suppl_no") String suppl_no) {
		log.info("supplier detail..........");
		return new ResponseEntity<SupplierDetailVO>(service.supplierDetail(suppl_no),HttpStatus.OK);
	}
	
	@GetMapping("/proposal/{compo_name}/{suppl_no}")
	public ResponseEntity<ProposalVO> getProposal(@PathVariable("compo_name") String compo_no, @PathVariable("suppl_no") String suppl_no){
		log.info("get proposal..........");

		return new ResponseEntity<ProposalVO>(service.getProposal(compo_no, suppl_no),HttpStatus.OK);
	}
	
	@GetMapping("/comparsionRetailer/{prod_name}")
	public ResponseEntity<RetailerDTO> comparsionRetailer(@PathVariable("prod_name") String prod_name) {
		log.info("retailerList.....");
		
		RetailerDTO dto = new RetailerDTO(service.retailerList(prod_name),prod_name,service.retailerCount(prod_name),service.productDetail(prod_name));
		return new ResponseEntity<RetailerDTO>(dto,HttpStatus.OK);
	}
	
	@GetMapping("/rmodal/{retail_no}")
	public ResponseEntity<RetailerDetailVO> retailerDetail(@PathVariable("retail_no") String retail_no) {
		log.info("retailer detail..........");
		return new ResponseEntity<RetailerDetailVO>(service.retailerDetail(retail_no),HttpStatus.OK);
	}
	
	@GetMapping("/predict/{prod_name}/{retail_no}")
	public ResponseEntity<SalePredictVO> getPredict(@PathVariable("prod_name") String prod_name, @PathVariable("retail_no") String retail_no){
		log.info("get predict..........");
		return new ResponseEntity<SalePredictVO>(service.getPredict(prod_name, retail_no),HttpStatus.OK);
	}
	@GetMapping("/customLogin")
	public void customLogin(String error, String logout, Model model) {
		log.info("error: "+error);
		log.info("logout: "+logout);
		if(error != null) {
			model.addAttribute("error","Login Error Check Your Account");
		}
		if(logout != null) {
			model.addAttribute("logout","Logout!");
		}
	}
	
	@GetMapping("/accessDenied")
	public String accessDenied() {
		return "redirect:/customLogin";
	}
	
	@GetMapping("/customLogout")
	public void logout(){
		log.info("logout");
	}
//	@PreAuthorize("isAuthenticated()")
//	@PostMapping("/checkPw/{id}/{checkPw}")
//	public ResponseEntity<String> checkPw(@PathVariable("id") String id, @PathVariable("checkPw") String checkPw) {
//		log.info("asdasdasdasdasda");
//		//EmpVO vo = service.read(id);
//		//String currentPw=vo.getPw();
//		String Pw=passwordEncoder.encode(checkPw);
//		boolean check = passwordEncoder.matches("pw185",Pw);
//		log.info(check);
//		
//		return check==true?new ResponseEntity<String>("success", HttpStatus.OK)
//				:new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
//		//return new ResponseEntity<String>("success", HttpStatus.OK);
//		
//	}
	@GetMapping("/modify")
	public void modify() {
	}
	@PostMapping("/modify")
	public String modifyProc(EmpVO vo,RedirectAttributes rttr) {
		if(service.updateEmp(vo)) {
			rttr.addFlashAttribute("result","success");
			rttr.addFlashAttribute("vo",vo);
		}
		return "redirect:/home";
	}
}
