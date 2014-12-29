package org.test.currency;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Jtest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMultiplication() {
			Dollar five= new Dollar(5);
			//five.times(2);
			Dollar product=five.times(2);
			assertEquals(10, product.amount);
			//five.times(3);
			product=five.times(3);
			//assertEquals(15,five.amount);
			assertEquals(15,product.amount);

	}
	
	public void testEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));

	}


}
