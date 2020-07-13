package com.simon.boot.word.pojo.oa;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class OaEmail implements Serializable {
    private Long id;

    private Long recipientId;

    private Long senderId;

    private Integer oaStatus;

    private String mailTitle;

    private Date createTime;

    private Date updateTime;

    private Integer isCheck;

    private String senderName;

    private Integer isDraft;

    private String recipientIds;

    private String recipientName;

    private String mailContent;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Long recipientId) {
        this.recipientId = recipientId;
    }

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public Integer getOaStatus() {
        return oaStatus;
    }

    public void setOaStatus(Integer oaStatus) {
        this.oaStatus = oaStatus;
    }

    public String getMailTitle() {
        return mailTitle;
    }

    public void setMailTitle(String mailTitle) {
        this.mailTitle = mailTitle == null ? null : mailTitle.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Integer isCheck) {
        this.isCheck = isCheck;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName == null ? null : senderName.trim();
    }

    public Integer getIsDraft() {
        return isDraft;
    }

    public void setIsDraft(Integer isDraft) {
        this.isDraft = isDraft;
    }

    public String getRecipientIds() {
        return recipientIds;
    }

    public void setRecipientIds(String recipientIds) {
        this.recipientIds = recipientIds == null ? null : recipientIds.trim();
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName == null ? null : recipientName.trim();
    }

    public String getMailContent() {
        return mailContent;
    }

    public void setMailContent(String mailContent) {
        this.mailContent = mailContent == null ? null : mailContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", recipientId=").append(recipientId);
        sb.append(", senderId=").append(senderId);
        sb.append(", oaStatus=").append(oaStatus);
        sb.append(", mailTitle=").append(mailTitle);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isCheck=").append(isCheck);
        sb.append(", senderName=").append(senderName);
        sb.append(", isDraft=").append(isDraft);
        sb.append(", recipientIds=").append(recipientIds);
        sb.append(", recipientName=").append(recipientName);
        sb.append(", mailContent=").append(mailContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}