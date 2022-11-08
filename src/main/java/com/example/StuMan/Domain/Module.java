package com.example.StuMan.Domain;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity

public class Module {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String modulecode;
	private String modulename;
	private String lecturerincharge;
	private String gpatype;
	private Double credits;
	 
	
	public Module() {
	}
	
	
	public Module(Long id, String modulecode, String modulename, String lecturerincharge, String gpatype,
			Double credits) {
		this.id = id;
		this.modulecode = modulecode;
		this.modulename = modulename;
		this.lecturerincharge = lecturerincharge;
		this.gpatype = gpatype;
		this.credits = credits;
	}

	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getModulecode() {
		return modulecode;
	}


	public void setModulecode(String modulecode) {
		this.modulecode = modulecode;
	}


	public String getModulename() {
		return modulename;
	}


	public void setModulename(String modulename) {
		this.modulename = modulename;
	}


	public String getLecturerincharge() {
		return lecturerincharge;
	}


	public void setLecturerincharge(String lecturerincharge) {
		this.lecturerincharge = lecturerincharge;
	}


	public String getGpatype() {
		return gpatype;
	}


	public void setGpatype(String gpatype) {
		this.gpatype = gpatype;
	}


	public Double getCredits() {
		return credits;
	}


	public void setCredits(Double credits) {
		this.credits = credits;
	}


	@Override
	public String toString() {
		return "Module [id=" + id + ", modulecode=" + modulecode + ", modulename=" + modulename + ", lecturerincharge="
				+ lecturerincharge + ", gpatype=" + gpatype + ", credits=" + credits + "]";
	}
	
	

}
