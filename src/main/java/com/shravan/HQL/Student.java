package com.shravan.HQL;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int roolno;
	private String name;
	@Override
	public String toString() {
		return "Student [roolno=" + roolno + ", name=" + name + ", marks=" + marks + "]";
	}
	public int getRoolno() {
		return roolno;
	}
	public void setRoolno(int roolno) {
		this.roolno = roolno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	private int marks;

}
