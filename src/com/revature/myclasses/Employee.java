package com.revature.myclasses;

public class Employee {
	int ID;
	String name;
	String department;
	double salary;
	
	public void setEmployee(int ID, String name, String department, double salary) {
		this.ID = ID;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public void displayEmployee () {
		System.out.println("ID        : " + this.ID);
		System.out.println("name      : " + this.name);
		System.out.println("department: " + this.department);
		System.out.println("salary    : " + this.salary+"\n");
	}
}
