package com.revature.myclasses;

public class Student {
	int rollNo;
	String name;
	String course;
	
	public void createStudent(int rollNo, String name, String course) {
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
	}
	
	public void displayStudent() {
		System.out.println("Roll number: "+this.rollNo + " Name: "+this.name+ " Course: "+this.course);
	}
}
