package com.ytjk.mapper;

import com.ytjk.entity.DocDept;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocDeptMapper {
    int insert(DocDept record);

    int insertSelective(DocDept record);

    DocDept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DocDept record);

    int updateByPrimaryKey(DocDept record);

    List<DocDept> listDept();
}