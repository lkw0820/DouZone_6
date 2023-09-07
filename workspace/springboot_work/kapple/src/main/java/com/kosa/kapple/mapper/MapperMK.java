package com.kosa.kapple.mapper;

import com.kosa.kapple.domain.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MapperMK {

    public List<SaleVO> getSaleList();

    public List<OrdersVO> getOrderList();

    public List<OrderReturnVO> getOrderReturnList();

    public List<ProduceVO> getProduceList();

    public List<ProductInventoryVO> getProdInvenList();

    public List<SaleReturnVO> getSaleReturnList();

    public List<ComponentInventoryVO> getCompoInvenList();

    public List<Object> getSaleQtyListByProduct();

    public List<Object> getSupplierDependencyByComponent();

    public List<Object> getComponentInventoryTurnover();
}
