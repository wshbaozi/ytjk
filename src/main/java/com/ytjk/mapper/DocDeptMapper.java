package com.ytjk.mapper;

import com.ytjk.entity.DocDept;

public interface DocDeptMapper {
    int insert(DocDept record);

    int insertSelective(DocDept record);

    DocDept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DocDept record);

    int updateByPrimaryKey(DocDept record);
}