package com.kosa.kapple.controller;

import com.kosa.kapple.domain.ComponentVO;
import com.kosa.kapple.service.ServiceBY;
import com.kosa.kapple.vo.*;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@AllArgsConstructor
public class ControllerBY{

    private ServiceBY service;

    @GetMapping("/components") // 부품 리스트 조회
    public List<ResponseComponent2> getAllComponents() {
        return service.getAllComponents();
    }

    @PostMapping("/component") // 부품 등록
    public ResponseEntity<RequestComponent2> saveComponent(@RequestBody RequestComponent2 component) {
        RequestComponent2 requestComponent = service.saveComponent(component);
        System.out.println(requestComponent);
        return ResponseEntity.status(HttpStatus.CREATED).body(requestComponent);
    }

    @PostMapping("/file") // 제안서 업로드
    public ResponseEntity<RequestFile> saveFile(@RequestParam("file") MultipartFile file) {

        try {
            String uniqueFileName = "PF_" + file.getOriginalFilename();
            Path filePath = Paths.get("C:/kapple-scm/supplier-proposal-file", uniqueFileName);

            file.transferTo(filePath.toFile());

            RequestFile requestFile = new RequestFile(UUID.randomUUID().toString(), "", uniqueFileName,"C:/kapple-scm/supplier-proposal-file" ) ;

            RequestFile saveFile = service.saveFile(requestFile);

            return ResponseEntity.status(HttpStatus.CREATED).body(saveFile);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @PutMapping("/file") // 제안서 공급사 아이디 등록(업데이트)
    public ResponseEntity<RequestFile> updateFile(@RequestBody RequestFile file) {

        RequestFile updateFile = service.updateFile(file);
        System.out.println(updateFile);
        return ResponseEntity.status(HttpStatus.CREATED).body(updateFile);
    }

    @PostMapping("/logo") // 로고 업로드
    public ResponseEntity<RequestLogo> saveLogo(@RequestParam("file") MultipartFile file) {

        try {
            String uniqueFileName = "logo_" + file.getOriginalFilename();

            Path directoryPath = Paths.get("C:/kapple-scm/logo/supplier");
            Path filePath = Paths.get("C:/kapple-scm/logo/supplier", uniqueFileName);

            if(!directoryPath.toFile().exists()) {
                directoryPath.toFile().mkdirs();
            }

            file.transferTo(filePath.toFile());

            RequestLogo requestLogo = new RequestLogo(UUID.randomUUID().toString(), "", uniqueFileName,"C:/kapple-scm/logo/supplier" ) ;
            RequestLogo saveLogo = service.saveLogo(requestLogo);

            return ResponseEntity.status(HttpStatus.CREATED).body(saveLogo);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @PutMapping("/logo") // 제안서 공급사 아이디 등록(업데이트)
    public ResponseEntity<RequestLogo> updateLogo(@RequestBody RequestLogo logo) {

        RequestLogo updateFile = service.updateLogo(logo);
        System.out.println(updateFile);

        return ResponseEntity.status(HttpStatus.CREATED).body(updateFile);
    }

    @PostMapping("/draft") // 부품 등록
    public ResponseEntity<RequestDraft> saveDraft(@RequestBody RequestDraft draft) {
        RequestDraft requestDraft = service.saveDraft(draft);
        System.out.println(requestDraft);
        return ResponseEntity.status(HttpStatus.CREATED).body(requestDraft);
    }

    @GetMapping("/draft") // 부품 등록
    public List<ResponseDraft> getAllDrafts() {
        return service.getAllDrafts();
    }

    @GetMapping("/suppliers2") // 부품 등록
    public List<ResponseSupplier> getAllSuppliers2() {
        return service.getAllSuppliers2();
    }




//    @PostMapping("/register")
//    public ResponseEntity<Map<String, Object>> registerSupplierAndProposal(@RequestBody addSupplierRequest request) {
//        try {
//
//            Map<String, Object> responseMap = new HashMap<>();
//            responseMap.put("message", "Success");
//            responseMap.put("supplier", request.getSupplier());
//            responseMap.put("proposal", request.getProposal());
//            responseMap.put("proposal", request.getLogo_uuid());
//            responseMap.put("proposal", request.getFile_uuid());
//
//            service.registerSupplierAndProposal(request);
//
//            return ResponseEntity.ok(responseMap);
//        } catch (Exception e) {
//            log.error("Error occurred in registerSupplierAndProposal.", e);
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.singletonMap("error", "Error occurred"));
//        }
//    }
//
//    @PostMapping("/draft")
//    public ResponseEntity<Map<String, Object>> registerSupplierDraft(@RequestBody SupplDraftVO request) {
//        try {
//
//            Map<String, Object> responseMap = new HashMap<>();
//            responseMap.put("message", "Success");
//            responseMap.put("supplDraft", request);
//
//            service.registerSupplDraft(request);
//
//            return ResponseEntity.ok(responseMap);
//        } catch (Exception e) {
//            log.error("Error occurred in registerSupplierAndProposal.", e);
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.singletonMap("error", "Error occurred"));
//        }
//    }
//
//    @GetMapping("/getDraft")
//    public List<SupplDraftVO> getSupplierDraft() {
//        return service.getSupplDraftList();
//    }
//
//    @PostMapping("/logo")
//    public ResponseEntity<Map<String, Object>> registerSupplierLogo(@RequestBody SupplLogoVO request) {
//        try {
//
//            Map<String, Object> responseMap = new HashMap<>();
//            responseMap.put("message", "Success");
//            responseMap.put("supplLogo", request);
//
//            service.registerSupplLogo(request);
//
//            return ResponseEntity.ok(responseMap);
//        } catch (Exception e) {
//            log.error("Error occurred in registerSupplierAndProposal.", e);
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.singletonMap("error", "Error occurred"));
//        }
//    }
//
//    @PostMapping("/file")
//    public ResponseEntity<Map<String, Object>> registerSupplierFile(@RequestBody SupplFileVO request) {
//        try {
//
//            Map<String, Object> responseMap = new HashMap<>();
//            responseMap.put("message", "Success");
//            responseMap.put("supplLogo", request);
//
//            service.registerSupplFile(request);
//
//            return ResponseEntity.ok(responseMap);
//        } catch (Exception e) {
//            log.error("Error occurred in registerSupplierAndProposal.", e);
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.singletonMap("error", "Error occurred"));
//        }
//    }
//
//    @PostMapping("/registerCompo")
//    public ResponseEntity<Map<String, Object>> registerComponent(@RequestBody ComponentVO request) {
//        try {
//
//            Map<String, Object> responseMap = new HashMap<>();
//            responseMap.put("message", "Success");
//            responseMap.put("component", request);
//
//            service.registerComponent(request);
//
//            return ResponseEntity.ok(responseMap);
//        } catch (Exception e) {
//            log.error("Error occurred in registerSupplierAndProposal.", e);
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.singletonMap("error", "Error occurred"));
//        }
//    }
}
