package com.ytjk.mapper;

import com.ytjk.entity.Doctor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorMapper {
    int insert(Doctor record);

    int insertSelective(Doctor record);

    Doctor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);

    /**
     * 根据关键字搜索医生
     * @param keyword
     * @return
     */
    Doctor searchDoctor(String keyword);

    /**
     * 根据deptId(不传时列出所有)获取专家列表
     * @param deptId
     * @return
     */
    List<Doctor> listDoctors(Integer deptId);
}