package org.test.inventory;

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTest {

	/*@Test
	public void test() {
		InventoryItem item=new InventoryItem();
		item.addItem(5);
		assertEquals(15, item.currentStock);
	}*/
	
	@Test
	public void testObject() {
		InventoryItem appleA= new InventoryItem(10);
		InventoryItem appleB=appleA.addItem(2);
		assertEquals(12, appleA.currentStock);
		appleB.addItem(3);
		assertEquals(15, appleB.currentStock);
	}
	
	@Test
	public void testEquality() {
		assertTrue(new InventoryItem(5).equals(new InventoryItem(5)));
	}

}
