package com.kosa.kapple.controller;

import com.kosa.kapple.domain.*;
import com.kosa.kapple.service.ServiceMKImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/show")
//@AllArgsConstructor
public class ControllerMK {

    @Autowired
    private ServiceMKImpl service;

//    @GetMapping("/sales")
//    public List<SaleVO> getSaleList() {
//        return service.getSaleList();
//    }

    @GetMapping("/allData")
    public ResponseEntity<Object> fetchInitialData(){
        Map<String, Object> result = new HashMap<>();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @GetMapping("/chart/all")
    public ResponseEntity<HashMap<String, Object>> initAllChart(){
        HashMap<String, Object> result = new HashMap<>();
        Object option;
        return new ResponseEntity<HashMap<String,Object>>(result, HttpStatus.OK);
    }

    // 요약 조회 ============================================
    @GetMapping("/comparison")
    public ResponseEntity<HashMap<String, Object>> getOrderList(){
//        Date startDate=null;
//        Date endDate=null;
        HashMap<String, Object> result = new HashMap<>();

//        // (부품) 주문 리스트 조회
//        List<OrdersVO> orderList = service.getOrderList();
//        resultMap.put("OrdersVO", orderList);
//        // (부품) 주문반품 리스트 조회
//        List<OrderReturnVO> orderReturnList = service.getOrderReturnList();
//        resultMap.put("OrderReturnVO", orderReturnList);
//        // (부품) 재고 리스트 조회
//        List<ComponentInventoryVO> compoInvenList = service.getCompoInvenList();
//        resultMap.put("ComponentInventoryVO", compoInvenList);
//
//        // (제품) 생산 리스트 조회
//        List<ProduceVO> produceList = service.getProduceList();
//        resultMap.put("ProduceVO", produceList);
//
//        // (제품) 판매 리스트 조회
//        List<SaleVO> saleList = service.getSaleList();
//        resultMap.put("SaleVO", produceList);
//
//        // (제품) 판매반품 리스트 조회
//        List<SaleReturnVO> saleReturnList = service.getSaleReturnList();
//        resultMap.put("SaleReturnVO", saleReturnList);
//
//        // (제품) 재고 리스트 조회
//        List<ProductInventoryVO> prodInvenList = service.getProdInvenList();
//        resultMap.put("ProductInventoryVO", prodInvenList);
//
//        // 제품별 판매량 SALES_QUANTITY_BY_PRODUCT
        List<Object> saleQtyListByProduct = service.getSaleQtyListByProduct();
        result.put("Object 제품별 판매량", saleQtyListByProduct);
//
//        // 부품별 공급사 의존도 SUPPLIER_DEPENDENCY_BY_COMPONENT
//        List<Object> supplierDependencyByComponent = service.getSupplierDependencyByComponent();
//        resultMap.put("Object 부품별 공급사 의존도", supplierDependencyByComponent);

        // 부품별 재고 회전율 INVENTORY_TURNOVER_BY_COMPONENT // 미완성
//        List<Object> componentInventoryTurnover = service.getComponentInventoryTurnover();
//        resultMap.put("Object 부품별 재고 회전율", componentInventoryTurnover);


        return new ResponseEntity<HashMap<String,Object>>(result, HttpStatus.OK);
    }

    // 비교 조회 ============================================
    // 부품 주문량

    // 제품 생산량
    // 제품 판매량
    // 제품 반품량


    // 분석 조회 ============================================
    // 제품별 판매량 조회
    // 판매 예측 정확도 조회
    // 부품 공급 의존도 조회
    // 부품 회전율 조회




}
