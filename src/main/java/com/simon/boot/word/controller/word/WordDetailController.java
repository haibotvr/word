package com.simon.boot.word.controller.word;

import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordDetail;
import com.simon.boot.word.qc.DetailQC;
import com.simon.boot.word.service.WordDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author simon.wei
 */
@RestController
@RequestMapping("detail")
public class WordDetailController {

    @Autowired
    private WordDetailService service;

    @PostMapping("add")
    public ReturnValue add(@RequestBody WordDetail record){
        return service.add(record);
    }

    @PostMapping("edit")
    public ReturnValue edit(@RequestBody WordDetail record){
        return service.edit(record);
    }

    @GetMapping("del/{id}")
    public ReturnValue del(@PathVariable Long id){
        return service.del(id);
    }

    @PostMapping("findByPage")
    public ReturnValue findByPage(@RequestBody DetailQC qc){
        return service.findByPage(qc);
    }

}
