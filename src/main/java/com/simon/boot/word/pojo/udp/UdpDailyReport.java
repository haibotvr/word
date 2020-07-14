package com.simon.boot.word.pojo.udp;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UdpDailyReport implements Serializable {
    /**
     * 主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "主键")
    private Long id;

    /**
     * 标题
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "标题")
    private String reportTitle;

    /**
     * 时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "时间")
    private Date reportTime;

    /**
     * 工作总结
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "工作总结")
    private String summary;

    /**
     * 问题反馈
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "问题反馈")
    private String feedback;

    /**
     * 明日计划
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "明日计划")
    private String tomorrowPlan;

    /**
     * 学习收获
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "学习收获")
    private String learnGains;

    /**
     * 日报状态
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "日报状态")
    private Integer reportStatus;

    /**
     * 用户ID
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "用户ID")
    private Long userId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle == null ? null : reportTitle.trim();
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback == null ? null : feedback.trim();
    }

    public String getTomorrowPlan() {
        return tomorrowPlan;
    }

    public void setTomorrowPlan(String tomorrowPlan) {
        this.tomorrowPlan = tomorrowPlan == null ? null : tomorrowPlan.trim();
    }

    public String getLearnGains() {
        return learnGains;
    }

    public void setLearnGains(String learnGains) {
        this.learnGains = learnGains == null ? null : learnGains.trim();
    }

    public Integer getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(Integer reportStatus) {
        this.reportStatus = reportStatus;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", reportTitle=").append(reportTitle);
        sb.append(", reportTime=").append(reportTime);
        sb.append(", summary=").append(summary);
        sb.append(", feedback=").append(feedback);
        sb.append(", tomorrowPlan=").append(tomorrowPlan);
        sb.append(", learnGains=").append(learnGains);
        sb.append(", reportStatus=").append(reportStatus);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}