package com.kosa.kapple.service;

import com.kosa.kapple.domain.*;
import com.kosa.kapple.mapper.MapperMK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ServiceMKImpl implements ServiceMK {

    @Autowired
    private MapperMK mapper;

    @Override
    public List<OrdersVO> getOrderList() {
        return mapper.getOrderList();
    }

    @Override
    public List<ProduceVO> getProduceList() {
        return mapper.getProduceList();
    }

    @Override
    public List<SaleVO> getSaleList() {
        return mapper.getSaleList();
    }

    @Override
    public List<ProductInventoryVO> getProdInvenList() {
        return mapper.getProdInvenList();
    }

    @Override
    public List<SaleReturnVO> getSaleReturnList() {
        return mapper.getSaleReturnList();
    }

    @Override
    public List<OrderReturnVO> getOrderReturnList() {
        return mapper.getOrderReturnList();
    }

    @Override
    public List<ComponentInventoryVO> getCompoInvenList() {
        return mapper.getCompoInvenList();
    }

    @Override
    public List<Object> getSaleQtyListByProduct() {
        return mapper.getSaleQtyListByProduct();
    }

    @Override
    public List<Object> getSupplierDependencyByComponent() {
        return mapper.getSupplierDependencyByComponent();
    }

    @Override
    public List<Object> getComponentInventoryTurnover() {
        return mapper.getComponentInventoryTurnover();
    }


}
