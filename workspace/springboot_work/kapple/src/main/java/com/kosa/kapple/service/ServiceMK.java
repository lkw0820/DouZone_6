package com.kosa.kapple.service;

import com.kosa.kapple.domain.*;

import java.util.List;

public interface ServiceMK {


    public List<OrdersVO> getOrderList();

    public List<ProduceVO> getProduceList();

    public List<SaleVO> getSaleList();

    public List<ProductInventoryVO> getProdInvenList();

    public List<SaleReturnVO> getSaleReturnList();

    public List<OrderReturnVO> getOrderReturnList();

    public List<ComponentInventoryVO> getCompoInvenList();

    public List<Object> getSaleQtyListByProduct();

    public List<Object> getSupplierDependencyByComponent();

    List<Object> getComponentInventoryTurnover();
}
