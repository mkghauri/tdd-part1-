package org.test.currency;

public class Dollar {
	
	int amount=10;

	public Dollar(int amount){
		this.amount= amount;
	}
	
	void times(int multiplier) {
		//amount= amount * 2;
		//amount = amount * multiplier;
		//reduce duplication
		amount *= multiplier;
	}

}
