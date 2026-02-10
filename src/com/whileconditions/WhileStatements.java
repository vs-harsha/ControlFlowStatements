package com.whileconditions;

public class WhileStatements {

	void loop(int i) {

		while (i <= 10) {
			System.out.println(i);
			i += 2;
		}

	}

	public static void main(String[] args) {

		WhileStatements e = new WhileStatements();
		e.loop(2);

	}

}
