package com.simon.boot.word.controller.word;

import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordRole;
import com.simon.boot.word.qc.RoleQC;
import com.simon.boot.word.service.WordRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author simon.wei
 */
@RestController
@RequestMapping("role")
public class WordRoleController {

    @Autowired
    private WordRoleService service;

    @PostMapping("add")
    public ReturnValue add(@RequestBody WordRole record){
        return service.add(record);
    }

    @PostMapping("edit")
    public ReturnValue edit(@RequestBody WordRole record){
        return service.edit(record);
    }

    @GetMapping("del/{id}")
    public ReturnValue del(@PathVariable Long id){
        return service.del(id);
    }

    @PostMapping("findByPage")
    public ReturnValue findByPage(@RequestBody RoleQC qc){
        return service.findByPage(qc);
    }

}
