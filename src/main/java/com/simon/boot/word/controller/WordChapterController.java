package com.simon.boot.word.controller;

import com.simon.boot.word.pojo.WordChapter;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.qc.PageQC;
import com.simon.boot.word.service.WordChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author simon.wei
 */
@RestController
@RequestMapping("chapter")
public class WordChapterController {

    @Autowired
    private WordChapterService service;

    @PostMapping("add")
    public ReturnValue add(@RequestBody WordChapter record){
        return service.add(record);
    }

    @PostMapping("edit")
    public ReturnValue edit(@RequestBody WordChapter record){
        return service.edit(record);
    }

    @GetMapping("del/{id}")
    public ReturnValue del(@PathVariable Long id){
        return service.del(id);
    }

    @PostMapping("findByPage")
    public ReturnValue findByPage(@RequestBody PageQC qc){
        return service.findByPage(qc);
    }

}
