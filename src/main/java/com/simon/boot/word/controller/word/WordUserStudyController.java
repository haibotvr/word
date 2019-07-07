package com.simon.boot.word.controller.word;

import com.simon.boot.word.framework.abstracts.BaseController;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordUserStudy;
import com.simon.boot.word.pojo.WordUserStudyLog;
import com.simon.boot.word.qc.StudyQC;
import com.simon.boot.word.service.WordUserStudyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author simon.wei
 */
@Api(tags = "WordUserStudyController", description = "用户学习管理")
@RestController
@RequestMapping("study")
public class WordUserStudyController extends BaseController {

    @Autowired
    private WordUserStudyService service;

    @ApiOperation("添加学习记录")
    @PostMapping("add")
    public ReturnValue add(@RequestBody WordUserStudy record) {
        record.setUserId(getWordUser().getId());
        return service.add(record);
    }

    @ApiOperation("添加学习日志")
    @PostMapping("addLog")
    public ReturnValue addLog(@RequestBody WordUserStudyLog record) {
        record.setUserId(getWordUser().getId());
        return service.addLog(record);
    }

    @ApiOperation("根据教材ID获取当前学习章节所有单词")
    @GetMapping("findWords/{id}")
    public ReturnValue findWords(@PathVariable Long id) {
        return service.findWords(id, getWordUser().getId());
    }

    @ApiOperation("根据章节ID获取所有单词")
    @GetMapping("findWordDetail/{id}")
    public ReturnValue findWordDetail(@PathVariable Long id) {
        return service.findWordDetail(id);
    }

    @ApiOperation("根据教材ID删除所有学习记录")
    @GetMapping("reStudy/{id}")
    public ReturnValue reStudy(@PathVariable Long id) {
        return service.reStudy(id, getWordUser().getId());
    }

    @ApiOperation("分页获取学习记录")
    @PostMapping("findByPage")
    public ReturnValue findByPage(@RequestBody StudyQC qc){
        return service.findByPage(qc, getWordUser());
    }

}
