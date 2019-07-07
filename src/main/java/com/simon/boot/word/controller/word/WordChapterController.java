package com.simon.boot.word.controller.word;

import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordChapter;
import com.simon.boot.word.qc.ChapterQC;
import com.simon.boot.word.service.WordChapterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author simon.wei
 */
@Api(tags = "WordChapterController", description = "章节管理")
@RestController
@RequestMapping("chapter")
public class WordChapterController {

    @Autowired
    private WordChapterService service;

    @ApiOperation("添加章节")
    @PostMapping("add")
    public ReturnValue add(@RequestBody WordChapter record){
        return service.add(record);
    }

    @ApiOperation("修改章节")
    @PostMapping("edit")
    public ReturnValue edit(@RequestBody WordChapter record){
        return service.edit(record);
    }

    @ApiOperation("删除章节")
    @GetMapping("del/{id}")
    public ReturnValue del(@PathVariable Long id){
        return service.del(id);
    }

    @ApiOperation("分页获取章节信息")
    @PostMapping("findByPage")
    public ReturnValue findByPage(@RequestBody ChapterQC qc){
        return service.findByPage(qc);
    }

}
