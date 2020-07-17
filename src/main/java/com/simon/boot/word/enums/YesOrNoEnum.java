package com.simon.boot.word.enums;

/**
 * @author simon.wei
 */
public enum YesOrNoEnum {

    YES("是", 1),
    NO("否", 0);

    private String name;
    private Integer value;

    YesOrNoEnum(String name, Integer value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }

}
