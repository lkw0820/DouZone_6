package com.kosa.kapple.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalePredictVO {

    private String sale_predict_no;
    private Date sale_date;
    private Long quantity;
    private Long price;
    private String algorithm;
    private Date created_at;

    private ProductVO product;
}
