package com.revature.mypackage;

import java.util.Scanner;

public class MethodsDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the first number?  ");
		int n1 = sc.nextInt();
		System.out.print("What is the second number?  ");
		int n2 = sc.nextInt();
		sum(n1,n2);
		difference(n1,n2);
		product(n1,n2);
		quotient(n1,n2);
	}
	private static void sum(int a, int b) {
		int result = a + b;
		System.out.println("The sum of "+a+" and "+b+" is "+result);
	}
	private static void difference(int a, int b) {
		int result = a - b;
		System.out.println("The difference between "+a+" and "+b+" is "+result);
	}
	private static void product(int a, int b) {
		int result = a * b;
		System.out.println("The product of "+a+" and "+b+" is "+result);
	}
	private static void quotient(int a, int b) {
		int result = a / b;
		System.out.println("The quotient between "+a+" and "+b+" is "+result);
	}

}
