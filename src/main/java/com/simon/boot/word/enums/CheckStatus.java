package com.simon.boot.word.enums;

/**
 * @author simon.wei
 */
public enum CheckStatus {

    YES("已查看", 1),
    NO("未查看", 0);

    private String name;
    private Integer value;

    CheckStatus(String name, Integer value){
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
