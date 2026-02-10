package com.switchcases;

public class GradingAscii {

	void Ascii(int marks) {

		switch (marks / 10) {
		case 1:
			System.out.println("Grade A");
			break;
		case 2:
			System.out.println("Grade B");
			break;
		case 3:
			System.out.println("Grade D");
			break;

		case 4:
			System.out.println("Fail");
		}
	}

	void grade(char g) {

		switch (g) {
		case 'A':
		case 'a':
			System.out.println("80–100");
			break;
		case 'B':
		case 'b':
			System.out.println("50–79");
			break;
		case 'D':
		case 'd':
			System.out.println("35–49");
			break;
		case 'F':
		case 'f':
			System.out.println("Fail");
			break;
		default:
			System.out.println("Invalid Grade");
		}
	}

//	void grade(int marks) {
//
//	    if (marks >= 80);
//	    else if (marks >= 50);
//	    else if (marks >= 35);
//
//	    switch (marks) {
//	      
//	    }
//	}

	public static void main(String[] args) {
		GradingAscii e = new GradingAscii();
		e.grade('g');
	}

}
