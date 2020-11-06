package com.simon.boot.word.dao.word;

import com.simon.boot.word.pojo.word.CallContacts;
import com.simon.boot.word.pojo.word.CallContactsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CallContactsMapper {
    long countByExample(CallContactsExample example);

    int deleteByExample(CallContactsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CallContacts record);

    int insertSelective(CallContacts record);

    List<CallContacts> selectByExample(CallContactsExample example);

    CallContacts selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CallContacts record, @Param("example") CallContactsExample example);

    int updateByExample(@Param("record") CallContacts record, @Param("example") CallContactsExample example);

    int updateByPrimaryKeySelective(CallContacts record);

    int updateByPrimaryKey(CallContacts record);
}