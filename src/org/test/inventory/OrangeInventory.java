package org.test.inventory;

public class OrangeInventory extends Inventory{
	
	
	public OrangeInventory(int currentStock){
		this.currentStock = currentStock;
	}
	
	public Inventory addItem(int quantity) {
		return new OrangeInventory(currentStock +=quantity);
		
	}

}
