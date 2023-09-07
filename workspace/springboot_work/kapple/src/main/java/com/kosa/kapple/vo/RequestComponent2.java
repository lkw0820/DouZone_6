package com.kosa.kapple.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestComponent2 {

    private String compo_no;
    private String compo_name;
    private String unit;
    private String detail;
    private String sort;
    private String sort_detail;
}
