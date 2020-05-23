package com.ercan.dao;

import com.ercan.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer>,StudentRepositoryCustom {


}
