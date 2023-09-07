package com.kosa.kapple.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseFile {
    private String uuid;
    private String suppl_no;
    private String file_name;
    private String path;
    private Date created_at;
}
