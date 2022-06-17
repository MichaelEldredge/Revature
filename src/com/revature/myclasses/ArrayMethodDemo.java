package com.revature.myclasses;

import java.util.Random;

public class ArrayMethodDemo {
	public static void main(String[] args) {
		int n = 10;
		int []myArray = new int[n];

		
		System.out.println("1: Assign random values to a "+n+" element array.");
		Random rand = new Random();
		for (int i = 0; i<n; i++) myArray[i] = rand.nextInt(1000);
		
		System.out.println("2: Display the array");
		display(myArray);
		
		System.out.println("\n3: Display the sum");
		System.out.println(sum(myArray));
		
		System.out.println("4: Display the even elements");
		int [] evens;
		evens = getEvenElements(myArray);
		display(evens);
		
		System.out.println("\n5: Display the odd elements");
		int [] odds;
		odds = getOddElements(myArray);
		display(odds);
		
		System.out.println("\n6: Display the sums of the even and odd numbers");
		System.out.println("Even sum: "+sum(evens)+ "; Odd sum: "+sum(odds));
		
		System.out.println("7: Sort the array in accending order");
		int [] accending = sortListAccending(myArray);
		display(accending);
		
		System.out.println("\n8: Sort the array in decending order");
		int [] decending = sortListDecending(myArray);
		display(decending);
		
		System.out.println("\n9: Display the average of the array");
		int average = sum(myArray)/n;
		System.out.println(average);
		
		System.out.println("10: Display the highest and lowest three elements");
		int [] smallestThree = new int[3];
		int [] largestThree = new int[3];
		for (int i = 0; i < 3; i++) {
			smallestThree[i] = accending[i];
			largestThree[i] = decending[i];
		}
		System.out.print("highest: ");
		display(largestThree);
		System.out.print("; lowest: ");
		display(smallestThree);
	}
	public static int sum(int [] nums) {
		int sum = 0;
		for (int i=0; i< nums.length ; i++)
			sum += nums[i];
		return sum;
	}
	public static void display(int [] nums) {
		System.out.print("{ ");
		for (int m:nums) System.out.print(m+" ");
		System.out.print("}");
	}
	public static int[] getEvenElements(int[] nums) {
		int i = 0;
		for (int m:nums) if (m%2 == 0) i++;
		int [] evens = new int[i];
		i = 0;
		for (int m:nums) if (m%2 == 0) evens[i++] = m;
		return evens;
	}
	public static int[] getOddElements(int[] nums) {
		int i = 0;
		for (int m:nums) if (m%2 == 1) i++;
		int [] odds = new int[i];
		i = 0;
		for (int m:nums) if (m%2 == 1) odds[i++] = m;
		return odds;
	}
	public static int[] sortListAccending(int[] nums) {
		int i = 0;
		int temp;
		int [] sorted = new int[nums.length];
		for (i=0; i<nums.length;i++) sorted[i] = nums[i];
		// Gnome sort, inefficient but easy to implement.
		i = 0;
		while (i<sorted.length - 1) {
			if (sorted[i]<=sorted[i+1])	i++;
			else {
				temp = sorted[i];
				sorted[i] = sorted[i+1];
				sorted[i+1] = temp;
				if (i>0) i--;
			}
		}
		return sorted;
	}
	public static int[] sortListDecending(int[] nums) {
		int i = 0;
		int temp;
		int [] sorted = new int[nums.length];
		for (i=0; i<nums.length;i++) sorted[i] = nums[i];
		// Gnome sort, inefficient but easy to implement.
		i = 0;
		while (i<sorted.length - 1) {
			if (sorted[i]>=sorted[i+1])	i++;
			else {
				temp = sorted[i];
				sorted[i] = sorted[i+1];
				sorted[i+1] = temp;
				if (i>0) i--;
			}
		}
		return sorted;
	}

}
