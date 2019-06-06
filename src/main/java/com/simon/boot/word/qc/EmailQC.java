package com.simon.boot.word.qc;

/**
 * @author simon.wei
 */
public class EmailQC extends PageQC {

    /**
     * 分类 1：收件箱 2：已发送 3：草稿箱 4：已删除
     */
    private Integer emailType;

    public Integer getEmailType() {
        return emailType;
    }

    public void setEmailType(Integer emailType) {
        this.emailType = emailType;
    }
}
