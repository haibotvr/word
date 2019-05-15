package com.simon.boot.word.controller;

import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordTeachMaterial;
import com.simon.boot.word.qc.PageQC;
import com.simon.boot.word.service.WordTeachMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author simon.wei
 */
@RestController
@RequestMapping("teachMaterial")
public class WordTeachMaterialController {

    @Autowired
    private WordTeachMaterialService service;

    @PostMapping("add")
    public ReturnValue add(@RequestBody WordTeachMaterial record){
        return service.add(record);
    }

    @PostMapping("edit")
    public ReturnValue edit(@RequestBody WordTeachMaterial record){
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
