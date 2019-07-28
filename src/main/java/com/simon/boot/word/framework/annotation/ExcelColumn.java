package com.simon.boot.word.framework.annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExcelColumn {

    /**
     * Excel标题
     */
    String value() default "";

    /**
     * Excel从左往右排列位置
     */
    int col() default 0;

}
