package com.simon.boot.word.vo;

import com.simon.boot.word.framework.annotation.ExcelColumn;
import lombok.Data;

/**
 * @author simon.wei
 */
@Data
public class ContactExcelVO {

    @ExcelColumn(value = "姓名", col = 1)
    private String realName;

    @ExcelColumn(value = "性别", col = 2)
    private String realSex;

    @ExcelColumn(value = "部门", col = 3)
    private String department;

    @ExcelColumn(value = "职务", col = 4)
    private String job;

    @ExcelColumn(value = "职务类别", col = 5)
    private String jobCategory;

    @ExcelColumn(value = "区号", col = 6)
    private String areaCode;

    @ExcelColumn(value = "电话", col = 7)
    private String telephone;

    @ExcelColumn(value = "分机号", col = 8)
    private String extensionNumber;

    @ExcelColumn(value = "区号2", col = 9)
    private String areaCode2;

    @ExcelColumn(value = "电话2", col = 10)
    private String telephone2;

    @ExcelColumn(value = "分机号2", col = 11)
    private String extensionNumber2;

    @ExcelColumn(value = "手机号", col = 12)
    private String phone;

    @ExcelColumn(value = "手机号2", col = 13)
    private String phone2;

    @ExcelColumn(value = "公司名称", col = 14)
    private String companyName;

    @ExcelColumn(value = "关键字", col = 15)
    private String keywords;

    @ExcelColumn(value = "省份", col = 16)
    private String province;

    @ExcelColumn(value = "城市", col = 17)
    private String city;

    @ExcelColumn(value = "地址", col = 18)
    private String address;

    @ExcelColumn(value = "邮编", col = 19)
    private String postCode;

    @ExcelColumn(value = "行业", col = 20)
    private String industry;

    @ExcelColumn(value = "行业(新)", col = 21)
    private String industryNew;

    @ExcelColumn(value = "细分行业", col = 22)
    private String industryDetail;

    @ExcelColumn(value = "企业性质", col = 23)
    private String companyNature;

    @ExcelColumn(value = "公司人数", col = 24)
    private Integer companyPersonNumber;

    @ExcelColumn(value = "PC数量", col = 25)
    private Integer pcNumber;

    @ExcelColumn(value = "年营业额", col = 26)
    private String annualTurnover;

    @ExcelColumn(value = "传真1", col = 27)
    private String fax1;

    @ExcelColumn(value = "传真2", col = 28)
    private String fax2;

    @ExcelColumn(value = "数据日期", col = 29)
    private String dataTime;

    @ExcelColumn(value = "来源人", col = 30)
    private String fromPerson;

    @ExcelColumn(value = "数据来源", col = 31)
    private String dataFrom;

    @ExcelColumn(value = "状态", col = 32)
    private String dataStatus;

    @ExcelColumn(value = "邮箱1", col = 33)
    private String email1;

    @ExcelColumn(value = "邮箱2", col = 34)
    private String email2;

    @ExcelColumn(value = "备注", col = 35)
    private String remark;

    @ExcelColumn(value = "是否AI行业", col = 36)
    private String industryAi;

    @ExcelColumn(value = "企业邮箱", col = 37)
    private String officeEmail;

    @ExcelColumn(value = "数据更新时间", col = 38)
    private String updateTime;
}
