package com.taskonloops;

import java.util.Scanner;

public class DoWhileTask1 {
	Scanner sc = new Scanner(System.in);
	void loop() {
		int n = sc.nextInt();
		int i = 1;
		do {
			System.out.println(n + " * " + i + "  =  " + (n * i));
			i++;
		} while (i <= 10);
	}

	public static void main(String[] args) {
		System.out.println("Enter Table Number");
		DoWhileTask1 e = new DoWhileTask1();
		e.loop();
	}

}
