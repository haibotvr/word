package com.simon.boot.word.qc;

/**
 * @author simon.wei
 */
public class DetailQC extends PageQC {

    private Long chapterId;

    private String wordEn;

    public Long getChapterId() {
        return chapterId;
    }

    public void setChapterId(Long chapterId) {
        this.chapterId = chapterId;
    }

    public String getWordEn() {
        return wordEn;
    }

    public void setWordEn(String wordEn) {
        this.wordEn = wordEn;
    }
}
