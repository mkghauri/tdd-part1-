package org.test.currency;

public class Dollar {
	
	int amount=10;
	//private int amount=10; //not done in Chapter 2 

	public Dollar(int amount){
		this.amount= amount;
	}
	
	Dollar times(int multiplier) {
		//amount= amount * 2;
		//amount = amount * multiplier;
		//reduce duplication
		//amount *= multiplier;
		//return null;
		//New Dollar with Correct Amount
		return new Dollar(amount * multiplier);
	}
	
	public boolean equals(Object object) {
		Dollar dollar= (Dollar) object;
		return amount == dollar.amount;
	}


}
