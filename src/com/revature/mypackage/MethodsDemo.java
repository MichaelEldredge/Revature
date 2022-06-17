package com.revature.mypackage;

import java.util.Scanner;

public class MethodsDemo {
public static void main(String[] args) {
	sum();
	difference();
	product();
	quotient();
	
}
	public static void sum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter Number 2 : ");
		int num2 = sc.nextInt();
		int result = num1+ num2;
		System.out.println("The sum of "+num1+" and "+num2+" is "+result);
		
	}
	public static void difference() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter Number 2 : ");
		int num2 = sc.nextInt();
		int result = num1 - num2;
		System.out.println("The difference between "+num1+" and "+num2+" is "+result);
		
	}
	public static void product() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter Number 2 : ");
		int num2 = sc.nextInt();
		int result = num1 * num2;
		System.out.println("The product of "+num1+" and "+num2+" is "+result);
		
	}
	public static void quotient() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter Number 2 : ");
		int num2 = sc.nextInt();
		int result = num1 / num2;
		System.out.println("The quotient between "+num1+" and "+num2+" is "+result);
		
	}
}
