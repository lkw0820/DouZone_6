package com.kosa.kapple.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oracle.sql.CHAR;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestDraft {
    private String draft_no;

    private String compo_no;
    private String compo_name;
    private Integer price;
    private Integer quantity;
    private Double defective_rate;
    private String quality_grade;
    private String prod_period;
    private Date pp_created_at;
    private Date pp_updated_at;
    private Boolean pp_status;

    private String suppl_no;
    private String suppl_name;
    private String business_no;
    private String phone_number;
    private String business_type;
    private String business_item;
    private String address;
    private String detail;
    private String is_contracted;
    private Date sp_created_at;
    private Date sp_updated_at;

    private String representative;
    private String company_type;
    private Integer employee_quantity;
    private Date establishment_date;

    private String suppl_level;
    private String stock_type;
    private Integer profit;
    private Integer net_profit;
    private Double debt_ratio;
    private Integer market_cap;

    private Date created_at;
}
