package com.ytjk.controller;

import com.alibaba.fastjson.JSON;
import com.ytjk.entity.DocDept;
import com.ytjk.entity.Doctor;
import com.ytjk.service.CoreService;
import com.ytjk.service.DoctorService;
import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2017/1/10.
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/doctor")
public class DoctorController {
    @Autowired
    protected WxMpConfigStorage configStorage;
    @Autowired
    protected WxMpService wxMpService;
    @Autowired
    protected CoreService coreService;
    @Autowired
    private DoctorService doctorService;


    @RequestMapping(value = "/listDoctors")
    public Object listDoctors(Integer deptId) throws Exception {
        List<Doctor> docList = doctorService.listDoctors(deptId);
        return JSON.toJSONString(docList);
    }

    @RequestMapping(value = "/viewDoctor")
    public Object viewDoctor(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Integer id = Integer.parseInt(request.getParameter("id"));
        Doctor doctor = doctorService.viewDoctor(id);
        return JSON.toJSONString(doctor);
    }

    @RequestMapping(value = "/listDept")
    public Object listDept(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<DocDept> list= doctorService.listDepts();
        return JSON.toJSONString(list);
    }
}
