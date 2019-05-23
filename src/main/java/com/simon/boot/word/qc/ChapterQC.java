package com.simon.boot.word.qc;

/**
 * @author simon.wei
 */
public class ChapterQC extends PageQC {

    private Long tmId;

    private String chapterName;

    public Long getTmId() {
        return tmId;
    }

    public void setTmId(Long tmId) {
        this.tmId = tmId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }
}
