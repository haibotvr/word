package com.simon.boot.word.controller.word;

import com.simon.boot.word.framework.abstracts.BaseController;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordUserStudy;
import com.simon.boot.word.pojo.WordUserStudyLog;
import com.simon.boot.word.qc.StudyQC;
import com.simon.boot.word.service.WordUserStudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author simon.wei
 */
@RestController
@RequestMapping("study")
public class WordUserStudyController extends BaseController {

    @Autowired
    private WordUserStudyService service;

    @PostMapping("add")
    public ReturnValue add(@RequestBody WordUserStudy record) {
        record.setUserId(getWordUser().getId());
        return service.add(record);
    }

    @PostMapping("addLog")
    public ReturnValue addLog(@RequestBody WordUserStudyLog record) {
        record.setUserId(getWordUser().getId());
        return service.addLog(record);
    }

    @GetMapping("findWords/{id}")
    public ReturnValue findWords(@PathVariable Long id) {
        return service.findWords(id, getWordUser().getId());
    }

    @GetMapping("findWordDetail/{id}")
    public ReturnValue findWordDetail(@PathVariable Long id) {
        return service.findWordDetail(id);
    }

    @GetMapping("reStudy/{id}")
    public ReturnValue reStudy(@PathVariable Long id) {
        return service.reStudy(id, getWordUser().getId());
    }

    @PostMapping("findByPage")
    public ReturnValue findByPage(@RequestBody StudyQC qc){
        return service.findByPage(qc, getWordUser());
    }

}
