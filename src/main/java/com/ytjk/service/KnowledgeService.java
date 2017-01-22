package com.ytjk.service;

import com.ytjk.entity.Knowledge;
import com.ytjk.mapper.KnowledgeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/1/22.
 */
@Service
public class KnowledgeService {
    @Autowired
    private KnowledgeMapper knowledgeMapper;

    public List<Knowledge> listKnowledge(Integer classId){
        return knowledgeMapper.listKnowledge(classId);
    }

    public Knowledge viewKnowledge(Integer id){
        return knowledgeMapper.selectByPrimaryKey(id);
    }
}
