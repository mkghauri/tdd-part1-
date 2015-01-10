package org.test.currency;

class Money {
	protected int amount;
	protected String currency;
	//abstract Money times(int multiplier);
	//abstract String currency();

	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	public boolean equals(Object object) {
		Money money= (Money) object;
		//return amount == money.amount && getClass().equals(money.getClass());
		return amount == money.amount && currency().equals(money.currency());
	}
	
	Money times(int multiplier) {
		return new Money(amount * multiplier, this.currency);
		//return null;
	}
	
	static Dollar dollar(int amount) {
		return new Dollar(amount,"USD");
	}

	static Money franc(int amount) {
		return new Franc(amount,"CHF");
	}
	
	String currency(){
		return this.currency;
	}
	
	public String toString() {
		return amount + " " + currency;
	}
	
}
