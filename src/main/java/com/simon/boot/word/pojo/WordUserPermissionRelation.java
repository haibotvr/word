package com.simon.boot.word.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class WordUserPermissionRelation implements Serializable {
    /**
     * 主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "主键")
    private Long id;

    /**
     * 用户主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "用户主键")
    private Long userId;

    /**
     * 权限主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "权限主键")
    private Long permissionId;

    /**
     * 类型
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "类型")
    private Integer type;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", permissionId=").append(permissionId);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}