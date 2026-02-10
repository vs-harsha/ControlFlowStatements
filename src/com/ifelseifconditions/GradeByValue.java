package com.ifelseifconditions;

public class GradeByValue {

	void gradePoints(int marks) {
		if (marks >= 0 && marks <= 100) {
			if (marks < 35) {
				System.out.println(" The Grade You Obtained Is F GRADE ");
			} else if (marks < 50) {
				System.out.println(" The Grade You Obtained Is C GRADE ");
			} else if (marks < 75) {
				System.out.println(" The Grade You Obtained Is B GRADE ");
			} else if (marks < 100) {
				System.out.println(" The Grade You Obtained Is A GRADE ");
			}
		} else {
			System.out.println("INVALID");
		}
	}

	public static void main(String[] args) {
		GradeByValue d = new GradeByValue();
		d.gradePoints(20);
	}

}
