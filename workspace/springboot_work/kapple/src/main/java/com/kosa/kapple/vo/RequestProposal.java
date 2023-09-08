package com.kosa.kapple.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestProposal {
    private String proposal_no;
    private String suppl_no;
    private String compo_no;
    private Integer price;
    private Integer quantity;
    private Double defective_rate;
    private String quality_grade;
    private String prod_period;
    private Date proposal_date;
    private String is_contracted;
    private Date start_date;
    private Date end_date;
    private String compo_name;
    private String suppl_name;
}
