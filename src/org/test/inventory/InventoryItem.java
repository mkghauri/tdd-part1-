package org.test.inventory;

public class InventoryItem {

	int currentStock=10;
	
	public void addItem(int quantity) {
		currentStock +=quantity;
	}

}
