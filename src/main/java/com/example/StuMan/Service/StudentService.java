package com.example.StuMan.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.StuMan.Domain.Student;
import com.example.StuMan.Repository.StudentRepository;
 
@Service
public class StudentService {

	@Autowired
    private StudentRepository repo;
public List<Student> listAll()
{
System.out.println(repo.findAll());
        return repo.findAll();
    }
    
 
    public void save(Student student) {
        repo.save(student);
    }
    
    public Student get(long sid) {
        return repo.findById(sid).get();
    }
    
    public void delete(long sid) {
        repo.deleteById(sid);
    }
    
}
