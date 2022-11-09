package com.example.StuMan.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.StuMan.Domain.AllResult;

@Repository
public interface AllResultRepository extends JpaRepository<AllResult, Long>{
	
	
	@Query(value ="SELECT s.sid, s.sname, SUM(r.rmarks*m.credits)/(SUM(m.credits)) as sgpa FROM student s INNER JOIN result AS r ON r.stdid = s.sid LEFT JOIN module m ON m.modulecode = r.rmodule GROUP BY s.sid", nativeQuery=true)
	List<Object[]>findAllResult();
}
