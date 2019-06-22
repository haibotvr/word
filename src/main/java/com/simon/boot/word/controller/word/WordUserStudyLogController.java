package com.simon.boot.word.controller.word;

import com.simon.boot.word.framework.abstracts.BaseController;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.qc.StudyLogQC;
import com.simon.boot.word.service.WordUserStudyLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author simon.wei
 */
@RestController
@RequestMapping("studyLog")
public class WordUserStudyLogController extends BaseController {

    @Autowired
    private WordUserStudyLogService service;

    @PostMapping("findByPage")
    public ReturnValue findByPage(@RequestBody StudyLogQC qc){
        return service.findByPage(qc, getWordUser());
    }

}
