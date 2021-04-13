package com.simon.boot.word.enums;

/**
 * @author simon.wei
 */
public enum YesOrNoStrEnum {

    YES("是", "Y"),
    NO("否", "N");

    private String name;
    private String value;

    YesOrNoStrEnum(String name, String value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

}
