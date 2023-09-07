package com.kosa.kapple.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseLogo {

    private String uuid;
    private String suppl_no;
    private String logo_name;
    private String path;
}
