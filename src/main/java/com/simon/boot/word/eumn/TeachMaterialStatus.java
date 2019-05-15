package com.simon.boot.word.eumn;

/**
 * @author simon.wei
 */
public enum TeachMaterialStatus {

    UNAVAILABLE("不可用", 0),
    AVAILABLE("可用", 1);

    private String name;
    private Integer value;

    TeachMaterialStatus(String name, Integer value){
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
