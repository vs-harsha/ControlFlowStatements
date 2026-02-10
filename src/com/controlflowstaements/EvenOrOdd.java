package com.controlflowstaements;

public class EvenOrOdd {

	void evenorodd(int num) {	
		if(num%2==0) {
			System.out.println(num + " is Even Number");
		}
		else {
			System.out.println(num + " is Odd Number");
		}
	}
	public static void main(String[] args) {	
		EvenOrOdd e = new EvenOrOdd();
		e.evenorodd(989);
	}
}
