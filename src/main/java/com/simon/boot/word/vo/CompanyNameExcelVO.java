package com.simon.boot.word.vo;

import com.simon.boot.word.framework.annotation.ExcelColumn;
import lombok.Data;

/**
 * @author simon.wei
 */
@Data
public class CompanyNameExcelVO {

    @ExcelColumn(value = "公司名称", col = 1)
    private String companyName;

}
