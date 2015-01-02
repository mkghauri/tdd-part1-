package org.test.inventory;

import static org.junit.Assert.*;

import org.junit.Test;

public class InventoryTest {

	/*@Test
	public void test() {
		InventoryItem item=new InventoryItem();
		item.addItem(5);
		assertEquals(15, item.currentStock);
	}*/
	
	@Test
	public void testObject() {
		AppleInventory appleA= new AppleInventory(10);
		Inventory appleB= appleA.addItem(2);
		assertEquals(12, appleA.currentStock);
		appleB.addItem(3);
		assertEquals(15, appleB.currentStock);
	}
	
	@Test
	public void testEquality() {
		Inventory inventory=  Inventory.apple(5);
		assertEquals(Inventory.apple(7), inventory.addItem(2));
		//assertEquals(Inventory.apple(8), inventory.addItem(3));
	}
	
	@Test
	public void testAppleMultiplication() {
		AppleInventory five= new AppleInventory(5);
		assertEquals(new AppleInventory(7), five.addItem(2));
		assertEquals(new AppleInventory(10), five.addItem(3));
	}

}
