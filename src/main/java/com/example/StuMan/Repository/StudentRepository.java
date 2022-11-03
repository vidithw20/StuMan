package com.example.StuMan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.StuMan.Domain.Student;
 
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}

