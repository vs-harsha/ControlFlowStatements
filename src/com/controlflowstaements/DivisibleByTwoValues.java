package com.controlflowstaements;

public class DivisibleByTwoValues {

	void dividibleby5and11 (int num1){
		if (num1%5==0 && num1%11==0) {
			System.out.println(num1 + " are divisible by 5 and 11 ");
		}
		else {
			System.out.println(num1 + " Are Not Divisible By 5 and 11 ");
		}
		
	}
	
	public static void main(String[] args) {
		
		DivisibleByTwoValues d = new DivisibleByTwoValues();
		d.dividibleby5and11(55);

	}

}
