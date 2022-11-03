package com.example.StuMan.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long sid;
	private String sname;
	private String slevel;
	private String snumber;
	private String sgmail;
	
	
	public Student() {
		
	}
	
	
	
	public Student(Long sid, String sname, String slevel, String snumber, String sgmail) {
		this.sid = sid;
		this.sname = sname;
		this.slevel = slevel;
		this.snumber = snumber;
		this.sgmail = sgmail;
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
	public String getSlevel() {
		return slevel;
	}
	public void setSlevel(String slevel) {
		this.slevel = slevel;
	}
	public String getSnumber() {
		return snumber;
	}
	public void setSnumber(String snumber) {
		this.snumber = snumber;
	}
	public String getSgmail() {
		return sgmail;
	}
	public void setSgmail(String sgmail) {
		this.sgmail = sgmail;
	}



	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", slevel=" + slevel + ", snumber=" + snumber + ", sgmail="
				+ sgmail + "]";
	}
	
	
	
}
