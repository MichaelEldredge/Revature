package com.revature.oops;

public class EmployeeManager {
	public static void main(String[] args) {
		SalariedEmployee se = new SalariedEmployee(1,"Dalinar",1000);
		ContractEmployee ce = new ContractEmployee(-2,"Lift",231);
		
		System.out.println(se.getName()+"'s salary: "+se.calculateSalary(5));
		System.out.println(ce.getName()+"'s salary: "+ce.calculateSalary(30));
	}
}
