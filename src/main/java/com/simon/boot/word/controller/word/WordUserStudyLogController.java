package com.simon.boot.word.controller.word;

import com.simon.boot.word.framework.abstracts.BaseController;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.qc.StudyLogQC;
import com.simon.boot.word.service.word.WordUserStudyLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author simon.wei
 */
@Api(tags = "WordUserStudyLogController", description = "用户学习日志管理")
@RestController
@RequestMapping("studyLog")
public class WordUserStudyLogController extends BaseController {

    @Autowired
    private WordUserStudyLogService service;

    @ApiOperation("分页获取学习日志")
    @PostMapping("findByPage")
    public ReturnValue findByPage(@RequestBody StudyLogQC qc){
        return service.findByPage(qc, getWordUser());
    }

    @ApiOperation("按章节ID获取学习日志")
    @GetMapping("findByChapter/{id}")
    public ReturnValue findByChapter(@PathVariable Long id){
        return service.findByChapter(id, getWordUser());
    }

}
