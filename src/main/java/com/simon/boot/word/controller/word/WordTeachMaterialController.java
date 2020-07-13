package com.simon.boot.word.controller.word;

import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.word.WordTeachMaterial;
import com.simon.boot.word.qc.TeachMaterialQC;
import com.simon.boot.word.service.word.WordTeachMaterialService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author simon.wei
 */
@Api(tags = "WordTeachMaterialController", description = "教材管理")
@RestController
@RequestMapping("teachMaterial")
public class WordTeachMaterialController {

    @Autowired
    private WordTeachMaterialService service;

    @ApiOperation("添加教材")
    @PostMapping("add")
    public ReturnValue add(@RequestBody WordTeachMaterial record){
        return service.add(record);
    }

    @ApiOperation("修改教材")
    @PostMapping("edit")
    public ReturnValue edit(@RequestBody WordTeachMaterial record){
        return service.edit(record);
    }

    @ApiOperation("删除教材")
    @GetMapping("del/{id}")
    public ReturnValue del(@PathVariable Long id){
        return service.del(id);
    }

    @ApiOperation("分页获取教材信息")
    @PostMapping("findByPage")
    public ReturnValue findByPage(@RequestBody TeachMaterialQC qc){
        return service.findByPage(qc);
    }

}
