package com.simon.boot.word.eumn;

/**
 * @author simon.wei
 */
public enum CheckStatus {

    YES("以查看", 1),
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
