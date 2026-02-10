package com.ifelseifconditions;

public class GradeByChar {

	void gradePoints(char ch) {

		if (ch == 'A' || ch == 'a') {
			System.out.println("Marks Scroed Between 76 to 100 ");
		} else if (ch == 'B' || ch == 'b') {
			System.out.println("Marks Scroed Between 51 to 75");
		} else if (ch == 'C' || ch == 'c') {
			System.out.println("Marks Scroed Between 36 to 50");
		} else if (ch == 'F' || ch == 'f') {
			System.out.println("Marks Scroed Between 0 to 35");
		} else {
			System.out.println("+++ In-Valid Grade You Entered +++" + " \n " + "   Please Enter Correct Grade   ");
		}
	}

	public static void main(String[] args) {
		GradeByChar s = new GradeByChar();
		s.gradePoints('T');
	}

}
