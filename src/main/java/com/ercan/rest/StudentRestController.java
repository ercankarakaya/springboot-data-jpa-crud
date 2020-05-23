package com.ercan.rest;

import com.ercan.entity.Student;
import com.ercan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentRestController {

    @Autowired
    private StudentService studentService;

    @GetMapping("")
    public List<Student> getStudents() {
        return studentService.findAll();
    }

    @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        return studentService.getbyId(studentId);
    }

    @PostMapping("/add-student")
    public Student add(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/delete-student/{studentId}")
    public String delete(@PathVariable int studentId) {
        studentService.deleteStudent(studentId);
        return studentId + " id deleted..";
    }


}
