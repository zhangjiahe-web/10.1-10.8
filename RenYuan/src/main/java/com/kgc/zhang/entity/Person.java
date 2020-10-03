package com.kgc.zhang.entity;

public class Person {
    private Integer id;

    private String name;

    private String sex;

    private Integer age;

    private String rank;

    private String departmevt;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public String getDepartmevt() {
        return departmevt;
    }

    public void setDepartmevt(String departmevt) {
        this.departmevt = departmevt == null ? null : departmevt.trim();
    }
}