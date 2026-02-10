package com.controlflowstaements;

public class Lagestnumber {
void largestNum(int a , int b) {
	if (a>b) {
		System.out.println(a+" is larger than "+b);
	}
	else {
		System.out.println(a+" is smaller than "+b);
	}
}
	public static void main(String[] args) {
		Lagestnumber w = new Lagestnumber();
		w.largestNum(40,30);
	}

}
