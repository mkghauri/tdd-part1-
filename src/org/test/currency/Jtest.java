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
			Money five=  Money.dollar(5);
			assertEquals(Money.dollar(10), five.times(2));
			assertEquals(Money.dollar(15), five.times(3));

			/*five.times(2);
			Dollar product=five.times(2);
			assertEquals(10, product.amount);
			//five.times(3);
			product=five.times(3);
			//assertEquals(15,five.amount);
			assertEquals(15,product.amount);*/

	}
	@Test
	public void testEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		//assertTrue(new Franc(5).equals(new Franc(5)));
		//assertFalse(new Franc(5).equals(new Franc(6)));
		

	}
	@Test
	public void testDifferentClassEquality() {
		assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
	}
	
	@Test
	public void testFrancMultiplication() {
		Franc five= new Franc(5,"CHF");
		assertEquals(new Franc(10,"CHF"), five.times(2));
		assertEquals(new Franc(15,"CHF"), five.times(3));
	}
	
	@Test
	public void testCurrency(){
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF",Money.franc(1).currency());
		
	}

}
