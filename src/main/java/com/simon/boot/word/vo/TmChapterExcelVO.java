package com.simon.boot.word.vo;

import com.simon.boot.word.framework.annotation.ExcelColumn;
import lombok.Data;

@Data
public class TmChapterExcelVO {

    @ExcelColumn(value = "英文", col = 1)
    private String wordEn;

    @ExcelColumn(value = "音标", col = 2)
    private String wordPhoneticSymbol;

    @ExcelColumn(value = "释义", col = 3)
    private String wordCh;

    @Override
    public String toString() {
        return "TmChapterExcelVO{" +
                "wordEn='" + wordEn + '\'' +
                ", wordPhoneticSymbol='" + wordPhoneticSymbol + '\'' +
                ", wordCh='" + wordCh + '\'' +
                '}';
    }
}
