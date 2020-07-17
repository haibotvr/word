package com.simon.boot.word.enums;

/**
 * @author simon.wei
 */
public enum DetailStatus {

    UNAVAILABLE("不可用", 0),
    AVAILABLE("可用", 1);

    private String name;
    private Integer value;

    DetailStatus(String name, Integer value){
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
