package com.acc.lkm.day4;

public class StackOverFlowDemo {
	static int i=0;
	public static int printNumbers(int x) {
		i=i+2;
		System.out.println(i);
		return i + printNumbers(i+2);
	}
	public static void main(String[] args) {
		StackOverFlowDemo.printNumbers(i);
	}

} 