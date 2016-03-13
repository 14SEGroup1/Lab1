package lab1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GrandTest {
	
	Beverage order1;
	Beverage order2;

	@Before
	public void setUp() throws Exception {
		order1 = new RedTea();
		((TeaBeverage) order1).setSize("grand");
		order2 = new Espresso();
		((CoffeeBeverage) order2).setSize("grand");
	}

	@Test
	public void test() {
		assertEquals(1.7,order1.cost(),0.001);
		assertEquals(2.3,order2.cost(),0.001);
	}

}
