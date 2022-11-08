package com.example.StuMan.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class AllResult {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long sid;
	private String sname;
	private Double sgpa;
	
	public AllResult() {
		
	}
	
	
	public AllResult(Long sid, String sname, Double sgpa) {
		this.sid = sid;
		this.sname = sname;
		this.sgpa = Math.round(sgpa * 100.0) / 100.0;
	}
	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Double getSgpa() {
		return sgpa;
	}
	public void setSgpa(Double sgpa) {
		this.sgpa = Math.round(sgpa * 100.0) / 100.0;
	}


	@Override
	public String toString() {
		return "AllResult [sid=" + sid + ", sname=" + sname + ", sgpa=" + sgpa + "]";
	}
	
	
	
	
	

}
