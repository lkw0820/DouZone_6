package com.kosa.kapple.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseSupplier {
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

    private String website;
    private String logo_name;

    private ResponseLogo responseLogo;
}
