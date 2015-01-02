package org.test.inventory;

public class AppleInventory extends Inventory {

	
	
	
	public AppleInventory(int currentStock){
		this.currentStock = currentStock;
	}
	
	public Inventory addItem(int quantity) {
		return new AppleInventory(currentStock +=quantity);
	}
	
	

}
