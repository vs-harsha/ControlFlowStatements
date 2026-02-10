package com.ifelseifconditions;

public class Reverse {

	void message(String value) {

		switch (value) {

		case "Sunday":
			System.out.println(" Today is Sunday holiday");
			break;
		case "Monday":
			System.out.println("Monday Is Working Day");
			break;
		case "Tuesday":
			System.out.println("Tuesday Go to Temple");
			break;
		case "Wednesday":
			System.out.println("Wednesday ");
			break;
		case "Thursday":
			System.out.println("Thursday");
			break;
		case "Friday":
			System.out.println("Friday");
			break;
		case "Saturday":
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid DAY ");

		}

	}

	public static void main(String[] args) {
		Reverse e = new Reverse();
		e.message("Sunday");
	}
}
