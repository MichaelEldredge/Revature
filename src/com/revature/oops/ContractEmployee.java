package com.revature.oops;

public class ContractEmployee extends Employee {
	private int hoursWorked;

	public ContractEmployee() {
		super();
	}

	public ContractEmployee(int id, String name, int hoursWorked) {
		super(id, name);
		this.hoursWorked = hoursWorked;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public double calculateSalary(int hoursWorked) {
		return 10.5*this.hoursWorked;
	}
	
}
