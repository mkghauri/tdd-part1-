package org.test.currency;

public class Franc extends Money {
	
	//private int amount;
	//private String currency;

	Franc(int amount,String currency) {
		super(amount,currency);
	}
	
	/*Money times(int multiplier) {
		//return new Franc(amount * multiplier,"CHF");
		//return Money.franc(amount * multiplier);
		return new Money(amount * multiplier, this.currency);
	}
	String currency(){
		return this.currency;
	}*/
}
