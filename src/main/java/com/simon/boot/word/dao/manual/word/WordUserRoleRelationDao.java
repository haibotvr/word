package com.simon.boot.word.dao.manual.word;

import com.simon.boot.word.pojo.word.WordPermission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author simon.wei
 */
@Mapper
@Repository
public interface WordUserRoleRelationDao {

    List<WordPermission> getPermissions(Long id);

    List<String> getRoles(Long id);

    List<Long> getRoleIds(Long id);
}
