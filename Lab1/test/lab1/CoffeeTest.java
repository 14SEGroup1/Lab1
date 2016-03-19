package lab1;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CoffeeTest {

	private static Beverage decafs,decafm,decafl,decafg,esps,espm,espl,espg,hsbs,hsbm,hsbl,hsbg;

	@BeforeClass
	public static void setUp() throws Exception {
		decafs = new Decaf();((CoffeeBeverage)decafs).setSize("small");
		decafm = new Decaf();((CoffeeBeverage)decafm).setSize("medium");
		decafl = new Decaf();((CoffeeBeverage)decafl).setSize("large");
		decafg = new Decaf();((CoffeeBeverage)decafg).setSize("grand");
		esps = new Espresso();((CoffeeBeverage)esps).setSize("small");
		espm = new Espresso();((CoffeeBeverage)espm).setSize("medium");
		espl = new Espresso();((CoffeeBeverage)espl).setSize("large");
		espg = new Espresso();((CoffeeBeverage)espg).setSize("grand");
		hsbs = new HouseBlend();((CoffeeBeverage)hsbs).setSize("small");
		hsbm = new HouseBlend();((CoffeeBeverage)hsbm).setSize("medium");
		hsbl = new HouseBlend();((CoffeeBeverage)hsbl).setSize("large");
		hsbg = new HouseBlend();((CoffeeBeverage)hsbg).setSize("grand");
	}

	@Test
	//test cost and description of redtea
	public void testRedTea() {
		assertEquals(0.9,decafs.cost(),0.0001);
		assertEquals(1.2,decafm.cost(),0.0001);
		assertEquals(1.5,decafl.cost(),0.0001);
		assertEquals(1.8,decafg.cost(),0.0001);
		assertEquals("Decaf",((Decaf)decafs).getDescription());
		assertEquals("Decaf",((Decaf)decafm).getDescription());
		assertEquals("Decaf",((Decaf)decafl).getDescription());
		assertEquals("Decaf",((Decaf)decafg).getDescription());
	}
	
	@Test
	//test cost and description of greentea
	public void testGreenTea() {
		assertEquals(1.4,esps.cost(),0.0001);
		assertEquals(1.7,espm.cost(),0.0001);
		assertEquals(2.0,espl.cost(),0.0001);
		assertEquals(2.3,espg.cost(),0.0001);
		assertEquals("Espresso",((Espresso)esps).getDescription());
		assertEquals("Espresso",((Espresso)espm).getDescription());
		assertEquals("Espresso",((Espresso)espl).getDescription());
		assertEquals("Espresso",((Espresso)espg).getDescription());
	}
	
	@Test
	//test cost and description of whitetea
	public void testWhiteTea() {
		assertEquals(1.2,hsbs.cost(),0.0001);
		assertEquals(1.5,hsbm.cost(),0.0001);
		assertEquals(1.8,hsbl.cost(),0.0001);
		assertEquals(2.1,hsbg.cost(),0.0001);
		assertEquals("HouseBlend",((HouseBlend)hsbs).getDescription());
		assertEquals("HouseBlend",((HouseBlend)hsbm).getDescription());
		assertEquals("HouseBlend",((HouseBlend)hsbl).getDescription());
		assertEquals("HouseBlend",((HouseBlend)hsbg).getDescription());
	}

}
