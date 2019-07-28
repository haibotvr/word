package com.simon.boot.word.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class WordLibrary implements Serializable {
    /**
     * 词库主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "词库主键")
    private Long id;

    /**
     * 英文
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "英文")
    private String nameEnglish;

    /**
     * 音标UK
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "音标UK")
    private String voiceUk;

    /**
     * 音标US
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "音标US")
    private String voiceUs;

    /**
     * 现在完成时
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "现在完成时")
    private String present;

    /**
     * 一般过去时
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "一般过去时")
    private String past;

    /**
     * 现在进行时
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "现在进行时")
    private String presentProgressive;

    /**
     * 复数变形
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "复数变形")
    private String complexDeformation;

    /**
     * 中文翻译
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "中文翻译")
    private String nameCh;

    /**
     * 例句
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "例句")
    private String exampleSentence;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameEnglish() {
        return nameEnglish;
    }

    public void setNameEnglish(String nameEnglish) {
        this.nameEnglish = nameEnglish == null ? null : nameEnglish.trim();
    }

    public String getVoiceUk() {
        return voiceUk;
    }

    public void setVoiceUk(String voiceUk) {
        this.voiceUk = voiceUk == null ? null : voiceUk.trim();
    }

    public String getVoiceUs() {
        return voiceUs;
    }

    public void setVoiceUs(String voiceUs) {
        this.voiceUs = voiceUs == null ? null : voiceUs.trim();
    }

    public String getPresent() {
        return present;
    }

    public void setPresent(String present) {
        this.present = present == null ? null : present.trim();
    }

    public String getPast() {
        return past;
    }

    public void setPast(String past) {
        this.past = past == null ? null : past.trim();
    }

    public String getPresentProgressive() {
        return presentProgressive;
    }

    public void setPresentProgressive(String presentProgressive) {
        this.presentProgressive = presentProgressive == null ? null : presentProgressive.trim();
    }

    public String getComplexDeformation() {
        return complexDeformation;
    }

    public void setComplexDeformation(String complexDeformation) {
        this.complexDeformation = complexDeformation == null ? null : complexDeformation.trim();
    }

    public String getNameCh() {
        return nameCh;
    }

    public void setNameCh(String nameCh) {
        this.nameCh = nameCh == null ? null : nameCh.trim();
    }

    public String getExampleSentence() {
        return exampleSentence;
    }

    public void setExampleSentence(String exampleSentence) {
        this.exampleSentence = exampleSentence == null ? null : exampleSentence.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nameEnglish=").append(nameEnglish);
        sb.append(", voiceUk=").append(voiceUk);
        sb.append(", voiceUs=").append(voiceUs);
        sb.append(", present=").append(present);
        sb.append(", past=").append(past);
        sb.append(", presentProgressive=").append(presentProgressive);
        sb.append(", complexDeformation=").append(complexDeformation);
        sb.append(", nameCh=").append(nameCh);
        sb.append(", exampleSentence=").append(exampleSentence);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}