package com.simon.boot.word.controller.word;

import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordSchool;
import com.simon.boot.word.qc.SchoolQC;
import com.simon.boot.word.service.WordSchoolService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author simon.wei
 */
@Api(tags = "WordSchoolController", description = "学校信息管理")
@RestController
@RequestMapping("school")
public class WordSchoolController {

    @Autowired
    private WordSchoolService service;

    @ApiOperation("添加学校信息")
    @PostMapping("add")
    public ReturnValue add(@RequestBody WordSchool record){
        return service.add(record);
    }

    @ApiOperation("修改学校信息")
    @PostMapping("edit")
    public ReturnValue edit(@RequestBody WordSchool record){
        return service.edit(record);
    }

    @ApiOperation("删除学校信息")
    @GetMapping("del/{id}")
    public ReturnValue del(@PathVariable Long id){
        return service.del(id);
    }

    @ApiOperation("分页获取学校信息")
    @PostMapping("findByPage")
    public ReturnValue findByPage(@RequestBody SchoolQC qc){
        return service.findByPage(qc);
    }

}
