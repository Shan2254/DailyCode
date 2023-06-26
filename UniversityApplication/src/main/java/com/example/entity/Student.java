package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int enrolNo;
	private String name;
	private int totalScore;
	
	
	private Student(int enrolNo, String name, int totalScore) {
		this.enrolNo = enrolNo;
		this.name = name;
		this.totalScore = totalScore;
	}


	public int getTotalScore() {
		return totalScore;
	}


	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}


	public int getEnrolNo() {
		return enrolNo;
	}


	public void setEnrolNo(int enrolNo) {
		this.enrolNo = enrolNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [enrolNo=" + enrolNo + ", name=" + name + "]";
	}
	
	
	

}
