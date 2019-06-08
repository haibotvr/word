package com.simon.boot.word.controller.word;

import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordSchool;
import com.simon.boot.word.qc.SchoolQC;
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
    public ReturnValue add(@RequestBody WordSchool record){
        return service.add(record);
    }

    @PostMapping("edit")
    public ReturnValue edit(@RequestBody WordSchool record){
        return service.edit(record);
    }

    @GetMapping("del/{id}")
    public ReturnValue del(@PathVariable Long id){
        return service.del(id);
    }

    @PostMapping("findByPage")
    public ReturnValue findByPage(@RequestBody SchoolQC qc){
        return service.findByPage(qc);
    }

}
