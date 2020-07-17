package com.simon.boot.word.enums;

/**
 * @author simon.wei
 */
public enum DraftStatus {

    YES("草稿", 1),
    NO("非草稿", 0);

    private String name;
    private Integer value;

    DraftStatus(String name, Integer value){
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
