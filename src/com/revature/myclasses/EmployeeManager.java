package com.revature.myclasses;

public class EmployeeManager {
	public static void main(String[] args) {
		Employee [] radients = new Employee[5];
		for (int i=0; i<radients.length; i++)
			radients[i] = new Employee();
		radients[0].setEmployee(001, "Dalinar", "Bondsmith", 1000);
		radients[1].setEmployee(2, "Kaladin", "Windrunner", 100);
		radients[2].setEmployee(3, "Shallan", "Lightweaver", 500);
		radients[3].setEmployee(4, "Jasnah", "Elsecaller", 2000);
		radients[4].setEmployee(-2, "Lift", "Edgedancer", 12.3456);
		for (int i=0; i<radients.length; i++)
			radients[i].displayEmployee();
		
	}

}
