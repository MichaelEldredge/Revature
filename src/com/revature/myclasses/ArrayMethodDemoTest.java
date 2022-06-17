package com.revature.myclasses;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class ArrayMethodDemoTest {

	@Test
	void emptySumTest() {
		int [] temp = {};
		assertTrue(0 == ArrayMethodDemo.sum(temp) );
	}
	@Test
	void singleElementSumTest() {
		int [] temp = {2};
		assertTrue(2 == ArrayMethodDemo.sum(temp));
	}
	@Test
	void multipleElementSumTest() {
		int [] temp = {1,2,3};
		assertTrue(6 == ArrayMethodDemo.sum(temp));
	}
	@Test
	void displayEmptyArrayTest() {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		String emptyList = "{ }";
		int [] temp = {};
		ArrayMethodDemo.display(temp);
		System.out.flush();
		System.setOut(old);
		assertTrue(emptyList.equals(baos.toString()));
	}
	@Test
	void displayFullArrayTest() {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		String trueList = "{ 1 2 }";
		int [] temp = {1,2};
		ArrayMethodDemo.display(temp);
		System.out.flush();
		System.setOut(old);
		assertTrue(trueList.equals(baos.toString()));
	}
	@Test
	void getEvenElementsEmptyTest() {
		int [] temp = {};
		assertTrue(Arrays.compare(ArrayMethodDemo.getEvenElements(temp),temp) == 0);
	}
	@Test
	void getEvenElementsOddTest() {
		int [] temp = {1};
		int [] emptyList = {};
		assertTrue(Arrays.compare(ArrayMethodDemo.getEvenElements(temp),emptyList) == 0);
	}
	@Test
	void getEvenmElementsEvenTest() {
		int [] temp = {2};
		assertTrue(Arrays.compare(ArrayMethodDemo.getEvenElements(temp),temp) == 0);
	}
	@Test
	void getOddElementsEmptyTest() {
		int [] temp = {};
		assertTrue(Arrays.compare(ArrayMethodDemo.getOddElements(temp),temp) == 0);
	}
	@Test
	void getOddElementsOddTest() {
		int [] temp = {1};
		assertTrue(Arrays.compare(ArrayMethodDemo.getOddElements(temp),temp) == 0);
	}
	@Test
	void getOddElementsEvenTest() {
		int [] temp = {2};
		int [] emptyList = {};
		assertTrue(Arrays.compare(ArrayMethodDemo.getOddElements(temp),emptyList) == 0);
	}
	@Test
	void sortListAccendingEmpty() {
		int [] temp = {};
		assertTrue(Arrays.compare(ArrayMethodDemo.sortListAccending(temp),temp)==0);
	}
	@Test
	void sortListAccendingTwo() {
		int [] temp = {2,1};
		int [] sorted = {1,2};
		assertTrue(Arrays.compare(ArrayMethodDemo.sortListAccending(temp),sorted)==0);
	}
	@Test
	void sortListDescendingTwo() {
		int [] temp = {1,2};
		int [] sorted = {2,1};
		assertTrue(Arrays.compare(ArrayMethodDemo.sortListDecending(temp),sorted)==0);		
	}
}
