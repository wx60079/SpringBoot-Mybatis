package com.beilin.entity;

public class User {
    /**
     *  name:学生实体
     */

    //主键id
    private int id;
    //姓名
    private String name;
    //年龄
    private int age;

    // Get和 Set方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
