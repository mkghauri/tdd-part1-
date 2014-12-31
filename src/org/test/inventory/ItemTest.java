package org.test.inventory;

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTest {

	@Test
	public void test() {
		InventoryItem item=new InventoryItem();
		item.addItem(5);
		assertEquals(15, item.currentStock);
	}

}
