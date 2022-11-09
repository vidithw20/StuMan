package com.example.StuMan.Domain;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity

public class Result {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long rid;
	private Long stdid;
	private String rmodule;
	private Double rmarks;
	
	
	
	public Result() {
		
	}
	
	
	public Result(Long rid, Long stdid, String rmodule, Double rmarks) {
		this.rid = rid;
		this.stdid = stdid;
		this.rmodule = rmodule;
		this.rmarks = rmarks;
	}
	public Long getRid() {
		return rid;
	}
	public void setRid(Long rid) {
		this.rid = rid;
	}
	public Long getStdid() {
		return stdid;
	}
	public void setStdid(Long stdid) {
		this.stdid = stdid;
	}
	public String getRmodule() {
		return rmodule;
	}
	public void setRmodule(String rmodule) {
		this.rmodule = rmodule;
	}
	public Double getRmarks() {
		return rmarks;
	}
	public void setRmarks(Double rmarks) {
		this.rmarks = rmarks;
	}


	@Override
	public String toString() {
		return "Result [rid=" + rid + ", stdid=" + stdid + ", rmodule=" + rmodule + ", rmarks=" + rmarks + "]";
	}
	
	
	
	
	
	

}
