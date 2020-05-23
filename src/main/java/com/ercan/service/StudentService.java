package com.ercan.service;

import com.ercan.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> findAll();
    public Student getbyId(int student_id);
    public Student saveStudent(Student student);
    public void deleteStudent(int student_id);
    public int getCount();
}
