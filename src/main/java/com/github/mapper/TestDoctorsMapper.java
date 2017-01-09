package com.github.mapper;

import com.github.entity.TestDoctors;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("doctorsMapper")
public interface TestDoctorsMapper {
    int insert(TestDoctors record);

    int insertSelective(TestDoctors record);

    TestDoctors selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestDoctors record);

    int updateByPrimaryKey(TestDoctors record);

    /**
     * 根据关键字搜索医生
     * @param keyword
     * @return
     */
    TestDoctors searchDoctor(String keyword);
}