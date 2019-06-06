package com.simon.boot.word.eumn;

/**
 * @author simon.wei
 */
public enum EmailStatus {

    USE("未删除", 1),
    DELETE("已删除", 0);

    private String name;
    private Integer value;

    EmailStatus(String name, Integer value){
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
