package com.simon.boot.word.controller;

import com.simon.boot.word.entity.WordSchool;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.qc.PageQC;
import com.simon.boot.word.service.WordSchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author simon.wei
 */
@RestController
@RequestMapping("school")
public class WordSchoolController {

    @Autowired
    private WordSchoolService service;

    @PostMapping("add")
    public ReturnValue add(WordSchool record){
        return service.add(record);
    }

    @PostMapping("edit")
    public ReturnValue edit(WordSchool record){
        return service.edit(record);
    }

    @GetMapping("del/{id}")
    public ReturnValue del(@PathVariable Long id){
        return service.del(id);
    }

    @PostMapping("findByPage")
    public ReturnValue findByPage(PageQC qc){
        return service.findByPage(qc);
    }

}
