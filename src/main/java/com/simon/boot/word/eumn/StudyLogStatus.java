package com.simon.boot.word.eumn;

/**
 * @author simon.wei
 */
public enum StudyLogStatus {

    UNAVAILABLE("未学习", 0),
    AVAILABLE("已学习", 1);

    private String name;
    private Integer value;

    StudyLogStatus(String name, Integer value){
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
