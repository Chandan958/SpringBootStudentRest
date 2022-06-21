package com.rk.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rk.model.Student;
@Repository
public interface StudenttRepo extends JpaRepository<Student, Integer>{

}
