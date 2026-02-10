package com.whileconditions;

public class While1 {
	void input(int i) {

		while (i <= 5) {

			System.out.println(i);
			i++;

		}
	}

	public static void main(String[] args) {
		While1 e = new While1();
		e.input(1);
	}

}
