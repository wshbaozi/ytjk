package com.ytjk.service;

import com.ytjk.entity.DocDept;
import com.ytjk.entity.Doctor;
import com.ytjk.mapper.DocDeptMapper;
import com.ytjk.mapper.DoctorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/1/10.
 */
@Service
public class DoctorService {
    @Autowired
    private DoctorMapper doctorsMapper;

    @Autowired
    private DocDeptMapper deptMapper;

    public List<Doctor> listDoctors(Integer DeptId)throws Exception{
        return doctorsMapper.listDoctors(DeptId);
    }

    public Doctor viewDoctor(Integer id)throws Exception{
        return doctorsMapper.getDoctorInfoById(id);
    }

    public List<DocDept> listDepts()throws Exception{
        return deptMapper.listDept();
    }
}
