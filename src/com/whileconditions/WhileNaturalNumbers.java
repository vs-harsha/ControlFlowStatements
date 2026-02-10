package com.whileconditions;

public class WhileNaturalNumbers {

	void natural() {
		int sum = 0;
		int i = 1;

		while (i <= 5) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		WhileNaturalNumbers w = new WhileNaturalNumbers();
		w.natural();
	}

}
