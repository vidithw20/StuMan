package com.example.StuMan.Service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.StuMan.Domain.Module;
import com.example.StuMan.Repository.ModuleRepository;
 
@Service
public class ModuleService {
	
	@Autowired
    private ModuleRepository repo;
	public List<Module> listAll() {
        return repo.findAll();
    }
    
    public void save(Module module) {
        repo.save(module);
    }
    
    public Module get(long id) {
        return repo.findById(id).get();
    }
    
    public void delete(long id) {
        repo.deleteById(id);
    }

}
