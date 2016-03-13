package lab1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DecafTest {

	Decaf order1;
	Decaf order2;
	@Before
	public void setUp() throws Exception {
		//order1 is a small decaf 
		//order2 is a medium decaf
		order1 = new Decaf();
		order2 = new Decaf();
		((CoffeeBeverage) order1).setSize("small");
		((CoffeeBeverage) order2).setSize("medium");
	}

	@Test
	public void testCost() {
		assertEquals(0.9, order1.cost(),0.0001);
		assertEquals(1.2, order2.cost(),0.0001);
		//fail("Cost calculation failure!");
	}


	@Test
	public void testGetDescription() {
		assertEquals("Decaf", order1.getDescription());
		assertEquals("Decaf", order2.getDescription());
		//fail("Get description failure!");
	}

}
