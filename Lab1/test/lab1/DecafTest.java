package lab1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DecafTest {

	Decaf order1,order2,order3,order4;
	@Before
	public void setUp() throws Exception {
		//decaf:small,medium,large,grand
		order1 = new Decaf();
		order2 = new Decaf();
		order3 = new Decaf();
		order4 = new Decaf();
		((CoffeeBeverage) order1).setSize("small");
		((CoffeeBeverage) order2).setSize("medium");
		((CoffeeBeverage) order3).setSize("large");
		((CoffeeBeverage) order4).setSize("grand");
	}

	@Test
	public void testCost() {
		assertEquals(0.9, order1.cost(),0.0001);
		assertEquals(1.2, order2.cost(),0.0001);
		assertEquals(1.5, order3.cost(),0.0001);
		assertEquals(1.8, order4.cost(),0.0001);
		//fail("Cost calculation failure!");
	}


	@Test
	public void testGetDescription() {
		assertEquals("Decaf", order1.getDescription());
		assertEquals("Decaf", order2.getDescription());
		assertEquals("Decaf", order3.getDescription());
		assertEquals("Decaf", order4.getDescription());
		//fail("Get description failure!");
	}

}
