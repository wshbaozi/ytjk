package com.ytjk.controller;

import com.ytjk.entity.Doctor;
import com.ytjk.service.CoreService;
import com.ytjk.service.DoctorService;
import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @ResponseBody
    public ModelAndView listDoctors(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("doctor_list");
        List<Doctor> docList = doctorService.listDoctors(null);
        mv.addObject(docList);
        return mv;
    }

    @RequestMapping(value = "/viewDoctor")
    @ResponseBody
    public ModelAndView viewDoctor(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        Integer id = Integer.parseInt(request.getParameter("id"));
        mv.setViewName("doctor_info");
        Doctor doctor = doctorService.viewDoctor(id);
        mv.addObject(doctor);
        return mv;
    }
}
