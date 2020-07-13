package com.simon.boot.word.pojo.word;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class WordRole implements Serializable {
    /**
     * 角色主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "角色主键")
    private Long id;

    /**
     * 角色编码
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "角色编码")
    private String roleCode;

    /**
     * 角色名称
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "角色名称")
    private String roleName;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 修改时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    /**
     * 状态
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "状态")
    private Integer ewStatus;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
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

    public Integer getEwStatus() {
        return ewStatus;
    }

    public void setEwStatus(Integer ewStatus) {
        this.ewStatus = ewStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleCode=").append(roleCode);
        sb.append(", roleName=").append(roleName);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", ewStatus=").append(ewStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}