package com.controlflowstaements;

public class PosOrNeg {

	void posneg(int num) {
		if(num>1) {
			System.out.println(num+" Is Positive Number");
		}
		else if (num<0) {
			System.out.println(num +" Is Negitive Number");
		}
		else {
			System.out.println("Zero is Nutral Value");
		}
		
	}
	
	public static void main(String[] args) {
		PosOrNeg e = new PosOrNeg();
		e.posneg(-65);
	}

}
