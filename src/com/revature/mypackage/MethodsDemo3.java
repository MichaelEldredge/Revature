package com.revature.mypackage;

import java.util.Scanner;

public class MethodsDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the first number?  ");
		int n1 = sc.nextInt();
		System.out.print("What is the second number?  ");
		int n2 = sc.nextInt();
		sum(n1,n2);
		System.out.println("The sum of "+n1+" and "+n2+" is "+sum(n1,n2));
		System.out.println("The difference between "+n1+" and "+n2+" is "+difference(n1,n2));
		System.out.println("The product of "+n1+" and "+n2+" is "+product(n1,n2));
		System.out.println("The quotient between"+n1+" and "+n2+" is "+quotient(n1,n2));
	}
	private static int sum(int a, int b) {
		return a + b;
	}
	private static int difference(int a, int b) {
		return a - b;
	}
	private static int product(int a, int b) {
		return a * b;
	}
	private static int quotient(int a, int b) {
		return a / b;
	}

}
