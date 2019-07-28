package com.simon.boot.word.controller.word;

import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordDetail;
import com.simon.boot.word.qc.DetailQC;
import com.simon.boot.word.service.WordDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author simon.wei
 */
@Api(tags = "WordDetailController", description = "单词管理")
@RestController
@RequestMapping("detail")
public class WordDetailController {

    @Autowired
    private WordDetailService service;

    @ApiOperation("添加单词")
    @PostMapping("add")
    public ReturnValue add(@RequestBody WordDetail record){
        return service.add(record);
    }

    @ApiOperation("修改单词")
    @PostMapping("edit")
    public ReturnValue edit(@RequestBody WordDetail record){
        return service.edit(record);
    }

    @ApiOperation("删除单词")
    @GetMapping("del/{id}")
    public ReturnValue del(@PathVariable Long id){
        return service.del(id);
    }

    @ApiOperation("分页获取单词信息")
    @PostMapping("findByPage")
    public ReturnValue findByPage(@RequestBody DetailQC qc){
        return service.findByPage(qc);
    }

    @ApiOperation("导入章节单词")
    @PostMapping("readExcel/{chapterId}")
    public ReturnValue readExcel(@RequestParam(value="file", required = false) MultipartFile file, @PathVariable Long chapterId){
        return service.readExcel(file, chapterId);
    }
}
