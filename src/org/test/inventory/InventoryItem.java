package org.test.inventory;

public class InventoryItem {

	int currentStock=10;
	int price=5;
	
	public InventoryItem(int currentStock){
		this.currentStock = currentStock;
	}
	
	public InventoryItem addItem(int quantity) {
		return new InventoryItem(currentStock +=quantity);
		
	}

}
