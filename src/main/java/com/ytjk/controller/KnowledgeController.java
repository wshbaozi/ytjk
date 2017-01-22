package com.ytjk.controller;

import com.alibaba.fastjson.JSON;
import com.ytjk.entity.Knowledge;
import com.ytjk.service.KnowledgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/1/22.
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/knowledge")
public class KnowledgeController {
    @Autowired
    private KnowledgeService knowlwdgeService;

    @RequestMapping(value = "/listKnowledge")
    public Object listDoctors(Integer classId) throws Exception {
        List<Knowledge> docList = knowlwdgeService.listKnowledge(classId);
        return JSON.toJSONString(docList);
    }

    @RequestMapping(value = "/viewKnowledge")
    public Object viewKnowledge(Integer id) throws Exception {
        Knowledge kl = knowlwdgeService.viewKnowledge(id);
        return JSON.toJSONString(kl);
    }
}
