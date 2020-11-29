package com.hand.dao;

import com.hand.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //查询所有学生信息和对应的老师信息
    public List<Student> getStudent();
    public List<Student> getStudent2();
}
