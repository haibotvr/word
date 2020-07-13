package com.simon.boot.word.pojo.word;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class WordPermission implements Serializable {
    /**
     * 权限主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "权限主键")
    private Long id;

    /**
     * 父级权限主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "父级权限主键")
    private Long pid;

    /**
     * 名称
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "名称")
    private String name;

    /**
     * 权限值
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "权限值")
    private String value;

    /**
     * 图标
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "图标")
    private String icon;

    /**
     * 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）")
    private Integer type;

    /**
     * 前端资源路径
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "前端资源路径")
    private String uri;

    /**
     * 启用状态；0->禁用；1->启用
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "启用状态；0->禁用；1->启用")
    private Integer ewStatus;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 排序
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "排序")
    private Integer sort;

    /**
     * 修改时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }

    public Integer getEwStatus() {
        return ewStatus;
    }

    public void setEwStatus(Integer ewStatus) {
        this.ewStatus = ewStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pid=").append(pid);
        sb.append(", name=").append(name);
        sb.append(", value=").append(value);
        sb.append(", icon=").append(icon);
        sb.append(", type=").append(type);
        sb.append(", uri=").append(uri);
        sb.append(", ewStatus=").append(ewStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", sort=").append(sort);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}