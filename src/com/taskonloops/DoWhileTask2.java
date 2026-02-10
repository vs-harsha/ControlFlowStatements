package com.taskonloops;

public class DoWhileTask2 {

	void loops(int i) {
		do {
			System.out.println("Hii This Is Task");
			i++;
		} while (i < 3);
	}

	public static void main(String[] args) {
		DoWhileTask2 e = new DoWhileTask2();
		e.loops(5);
	}

}