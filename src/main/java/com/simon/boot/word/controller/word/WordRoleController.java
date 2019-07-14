package com.simon.boot.word.controller.word;

import com.simon.boot.word.framework.abstracts.BaseController;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordRole;
import com.simon.boot.word.qc.RoleQC;
import com.simon.boot.word.service.WordRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author simon.wei
 */
@Api(tags = "WordRoleController", description = "角色管理")
@RestController
@RequestMapping("role")
public class WordRoleController extends BaseController {

    @Autowired
    private WordRoleService service;

    @ApiOperation("添加角色")
    @PostMapping("add")
    public ReturnValue add(@RequestBody WordRole record){
        return service.add(record);
    }

    @ApiOperation("修改角色")
    @PostMapping("edit")
    public ReturnValue edit(@RequestBody WordRole record){
        return service.edit(record);
    }

    @ApiOperation("删除角色")
    @GetMapping("del/{id}")
    public ReturnValue del(@PathVariable Long id){
        return service.del(id);
    }

    @ApiOperation("分页获取角色信息")
    @PostMapping("findByPage")
    public ReturnValue findByPage(@RequestBody RoleQC qc){
        return service.findByPage(qc);
    }

    @ApiOperation("查询所有角色")
    @PostMapping("findRoles")
    public ReturnValue findRoles(){
        return service.findRoles(getWordUser());
    }

}
