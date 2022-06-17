package com.revature.oops;

public class SalariedEmployee extends Employee{
	private int daysPresent;

	public SalariedEmployee(int id, String name, int daysPresent) {
		super(id, name);
		this.daysPresent = daysPresent;
	}

	public SalariedEmployee() {
		super();
		System.out.println("Salaried Employee Default Constructor");
	}
	public double calculateSalary(int daysPresent) {
		return 1000.00*this.daysPresent;
	}

}
