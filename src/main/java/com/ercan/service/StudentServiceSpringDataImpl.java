package com.ercan.service;

import com.ercan.dao.StudentRepository;
import com.ercan.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceSpringDataImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student getbyId(int student_id) {
        Optional<Student> std=studentRepository.findById(student_id);
        if (std.isPresent())
            return std.get();
        else
         throw new RuntimeException("Böyle bir id yok !");

    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(int student_id) {
        studentRepository.deleteById(student_id);
    }

    @Override
    public int getCount() {
        return studentRepository.getStudentCount();
    }


}
