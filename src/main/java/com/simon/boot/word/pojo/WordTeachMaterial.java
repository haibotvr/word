package com.simon.boot.word.pojo;

import java.util.Date;

public class WordTeachMaterial {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column word_teach_material.id
     *
     * @mbg.generated Wed May 15 15:29:18 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column word_teach_material.tm_name
     *
     * @mbg.generated Wed May 15 15:29:18 CST 2019
     */
    private String tmName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column word_teach_material.create_time
     *
     * @mbg.generated Wed May 15 15:29:18 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column word_teach_material.update_time
     *
     * @mbg.generated Wed May 15 15:29:18 CST 2019
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column word_teach_material.e_status
     *
     * @mbg.generated Wed May 15 15:29:18 CST 2019
     */
    private Integer eStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column word_teach_material.id
     *
     * @return the value of word_teach_material.id
     *
     * @mbg.generated Wed May 15 15:29:18 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column word_teach_material.id
     *
     * @param id the value for word_teach_material.id
     *
     * @mbg.generated Wed May 15 15:29:18 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column word_teach_material.tm_name
     *
     * @return the value of word_teach_material.tm_name
     *
     * @mbg.generated Wed May 15 15:29:18 CST 2019
     */
    public String getTmName() {
        return tmName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column word_teach_material.tm_name
     *
     * @param tmName the value for word_teach_material.tm_name
     *
     * @mbg.generated Wed May 15 15:29:18 CST 2019
     */
    public void setTmName(String tmName) {
        this.tmName = tmName == null ? null : tmName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column word_teach_material.create_time
     *
     * @return the value of word_teach_material.create_time
     *
     * @mbg.generated Wed May 15 15:29:18 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column word_teach_material.create_time
     *
     * @param createTime the value for word_teach_material.create_time
     *
     * @mbg.generated Wed May 15 15:29:18 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column word_teach_material.update_time
     *
     * @return the value of word_teach_material.update_time
     *
     * @mbg.generated Wed May 15 15:29:18 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column word_teach_material.update_time
     *
     * @param updateTime the value for word_teach_material.update_time
     *
     * @mbg.generated Wed May 15 15:29:18 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column word_teach_material.e_status
     *
     * @return the value of word_teach_material.e_status
     *
     * @mbg.generated Wed May 15 15:29:18 CST 2019
     */
    public Integer geteStatus() {
        return eStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column word_teach_material.e_status
     *
     * @param eStatus the value for word_teach_material.e_status
     *
     * @mbg.generated Wed May 15 15:29:18 CST 2019
     */
    public void seteStatus(Integer eStatus) {
        this.eStatus = eStatus;
    }
}