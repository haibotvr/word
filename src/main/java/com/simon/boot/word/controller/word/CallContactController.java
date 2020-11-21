package com.simon.boot.word.controller.word;

import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.word.CallContacts;
import com.simon.boot.word.pojo.word.WordChapter;
import com.simon.boot.word.qc.CallContactsQC;
import com.simon.boot.word.qc.ChapterQC;
import com.simon.boot.word.service.word.CallContactsService;
import com.simon.boot.word.service.word.WordChapterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author simon.wei
 */
@Api(tags = "WordChapterController", description = "章节管理")
@RestController
@RequestMapping("call")
public class CallContactController {

    @Autowired
    private CallContactsService service;

    @ApiOperation("添加联系人")
    @PostMapping("add")
    public ReturnValue add(@RequestBody CallContacts record){
        return service.add(record);
    }

    @ApiOperation("修改联系人")
    @PostMapping("edit")
    public ReturnValue edit(@RequestBody CallContacts record){
        return service.edit(record);
    }

    @ApiOperation("分页获取联系人信息")
    @PostMapping("findByPage")
    public ReturnValue findByPage(@RequestBody CallContactsQC qc){
        return service.findByPage(qc);
    }

//    @ApiOperation("导入联系人")
//    @PostMapping("readExcel")
//    @PreAuthorize("hasAuthority('word:chapter:import')")
//    public ReturnValue readExcel(@RequestParam(value="file", required = false) MultipartFile file){
//        return service.readExcel(file);
//    }

}
