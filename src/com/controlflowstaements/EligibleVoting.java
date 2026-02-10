package com.controlflowstaements;

public class EligibleVoting {
	void eligibleforvote(int age) {
	
		if(age>=18) {
			System.out.println(age + " are Eligible For Voting ");
		}
		else {
			System.out.println(age + " Not Eligible For Voting ");
		}
		
	}
	public static void main(String[] args) {
		EligibleVoting v = new EligibleVoting();
		v.eligibleforvote(17);

	}

}
