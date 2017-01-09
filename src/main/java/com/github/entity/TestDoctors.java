package com.github.entity;

import java.util.Date;

public class TestDoctors {
    private Integer id;

    private String name;

    private String desc;

    private Short age;

    private Integer proLevel;

    private Byte sex;

    private Date createdTime;

    private String headPhoto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public Integer getProLevel() {
        return proLevel;
    }

    public void setProLevel(Integer proLevel) {
        this.proLevel = proLevel;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getHeadPhoto() {
        return headPhoto;
    }

    public void setHeadPhoto(String headPhoto) {
        this.headPhoto = headPhoto == null ? null : headPhoto.trim();
    }
}