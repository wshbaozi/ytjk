package com.ytjk.mapper;

import com.ytjk.entity.Knowledge;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KnowledgeMapper {
    int insert(Knowledge record);

    int insertSelective(Knowledge record);

    Knowledge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Knowledge record);

    int updateByPrimaryKey(Knowledge record);

    List<Knowledge> listKnowledge(Integer classId);
}