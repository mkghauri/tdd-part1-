package org.test.currency;

public class Dollar extends Money{
	
	//int amount=10;
	//private int amount=10; //not done in Chapter 2
	
	//private String currency;

	Dollar(int amount,String currency){
		super(amount,currency);
	}
	
	
	/*Money times(int multiplier) {
		//amount= amount * 2;
		//amount = amount * multiplier;
		//reduce duplication
		//amount *= multiplier;
		//return null;
		//New Dollar with Correct Amount
		//return Money.dollar(amount * multiplier);
		return new Money(amount * multiplier, this.currency);
	}
	
	String currency(){
		return currency;
	}*/

}
