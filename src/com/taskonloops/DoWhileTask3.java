package com.taskonloops;

public class DoWhileTask3 {
	void evenorodd(int i) {
		do {
			i++;
			System.out.println(i);
		} while (i < 5);
	}

	public static void main(String[] args) {
		DoWhileTask3 w = new DoWhileTask3();
		w.evenorodd(0);

	}
}
