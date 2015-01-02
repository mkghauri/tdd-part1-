package org.test.currency;

public class Dollar extends Money{
	
	//int amount=10;
	//private int amount=10; //not done in Chapter 2 

	public Dollar(int amount){
		this.amount= amount;
	}
	
	Money times(int multiplier) {
		//amount= amount * 2;
		//amount = amount * multiplier;
		//reduce duplication
		//amount *= multiplier;
		//return null;
		//New Dollar with Correct Amount
		return new Dollar(amount * multiplier);
	}
	
	

	

}
