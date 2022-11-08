package com.example.StuMan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StuMan.Domain.AllResult;
import com.example.StuMan.Repository.AllResultRepository;


@Service
public class AllResultService {
	
	@Autowired
    private AllResultRepository repo;
	public List<AllResult> listAll() {
        return repo.findAll();
    }

}
