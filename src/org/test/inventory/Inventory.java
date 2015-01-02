package org.test.inventory;

abstract class Inventory {

	int currentStock=10;
	int price=5;
	
	abstract Inventory addItem(int quantity);
	
	public boolean equals(Object object) {
		Inventory ii=(Inventory) object;
		return this.price * this.currentStock == ii.price * ii.currentStock;
	}
	
	static AppleInventory apple(int currentStock){
		return new AppleInventory(currentStock);
	}
	
	static OrangeInventory orange(int currentStock){
		return new OrangeInventory(currentStock);
	}
}
