package com.example.StuMan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.StuMan.Domain.Module;
 
@Repository
public interface ModuleRepository extends JpaRepository<Module, Long>{

}
