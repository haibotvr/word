package com.simon.boot.word.dao.manual;

import com.simon.boot.word.pojo.WordPermission;
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

}
