package com.rk.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name = "stdtab")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sId;
	private String sName;
	private Double sGrade;
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(Integer sId, String sName, Double sGrade) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sGrade = sGrade;
	}


	public Integer getsId() {
		return sId;
	}


	public void setsId(Integer sId) {
		this.sId = sId;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public Double getsGrade() {
		return sGrade;
	}


	public void setsGrade(Double sGrade) {
		this.sGrade = sGrade;
	}


	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sGrade=" + sGrade + "]";
	}


	
	
	

}
