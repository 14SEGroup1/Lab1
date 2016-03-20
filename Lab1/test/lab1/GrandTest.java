package lab1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GrandTest {
	
	Beverage order1,order2,order3,order4,order5,order6;

	@Before
	public void setUp() throws Exception {
		order1 = new RedTea();
		((TeaBeverage) order1).setSize("grand");
		order2 = new GreenTea();
		((TeaBeverage) order2).setSize("grand");
		order3 = new WhiteTea();
		((TeaBeverage) order3).setSize("grand");
		order4 = new Decaf();
		((CoffeeBeverage) order4).setSize("grand");
		order5 = new Espresso();
		((CoffeeBeverage) order5).setSize("grand");
		order6 = new HouseBlend();
		((CoffeeBeverage) order6).setSize("grand");
	}

	@Test
	public void test() {
		assertEquals(1.7,order1.cost(),0.001);
		assertEquals(1.9,order2.cost(),0.001);
		assertEquals(1.9,order3.cost(),0.001);
		assertEquals(1.8,order4.cost(),0.001);
		assertEquals(2.3,order5.cost(),0.001);
		assertEquals(2.1,order6.cost(),0.001);
	}

}
