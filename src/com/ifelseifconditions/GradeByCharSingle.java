package com.ifelseifconditions;

public class GradeByCharSingle {

	void gradePoints(char ch) {
		if (ch == 'A') {
			System.out.println("Marks Scroed Between 76 to 100");
		} else if (ch == 'B') {
			System.out.println("Marks Scroed Between 51 to 75");
		} else if (ch == 'c') {
			System.out.println("Marks Scroed Between 36 to 50");
		} else if (ch == 'F') {
			System.out.println("Marks Scroed Between 0 to 35");
		} else {
			System.out.println("Invalid");
		}
	}

	public static void main(String[] args) {
		GradeByCharSingle e = new GradeByCharSingle();
		e.gradePoints('A');
	}

}
