package com.example.StuMan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StuMan.Domain.Result;
import com.example.StuMan.Repository.ResultRepository;


@Service
public class ResultService {
	
	@Autowired
    private ResultRepository repo;
public List<Result> listAll()
{
System.out.println(repo.findAll());
        return repo.findAll();
    }
    
 
    public void save(Result result) {
        repo.save(result);
    }
    
    public Result get(long rid) {
        return repo.findById(rid).get();
    }
    
    public void delete(long rid) {
        repo.deleteById(rid);
    }

}
