package com.switchcases;

public class SimpleCaluculator {

	void Caluculator(int num1, int num2, char operator) {

		switch (operator) {

		case '+':
			System.out.println("Addition Of " + num1 + " and " + num2 + " : " + (num1 + num2));
			break;
		case '-':
			System.out.println("Subtraction Of " + num1 + " and " + num2 + " : " + (num1 - num2));
			break;
		case '*':
			System.out.println("Multiplication Of " + num1 + " and " + num2 + " : " + (num1 * num2));
			break;
		case '/':
			System.out.println("Division Of " + num1 + " and " + num2 + " : " + (num1 / num2));
			break;
		case '%':
			System.out.println("Modulus Of " + num1 + " and " + num2 + " : " + (num1 % num2));
			break;
		default:
			System.out.println("Invalid Operator you have entred");

		}

	}
}