package lab1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class IngredientTest {
    
	private Beverage greentea,espresso;
	@Before
	public void setUpBeforeClass() throws Exception {
		//since I have tested all kinds of coffee and tea before, I will only use greentea and espresso in this test
	    greentea = new GreenTea();
	    ((TeaBeverage)greentea).setSize("medium");
	    espresso = new Espresso();
	    ((CoffeeBeverage)espresso).setSize("medium");
	}

	@Test
	public void testChocolate() {
		espresso = new Chocolate(espresso);
		greentea = new Chocolate(greentea);
		assertEquals(2.0,espresso.cost(),0.0001);
		assertEquals(null+" chocolate",((BeverageWithIngredient)espresso).getDescription());
		assertEquals(1.8,greentea.cost(),0.0001);
		assertEquals(null+" chocolate",((BeverageWithIngredient)greentea).getDescription());
	}
	
	@Test
	public void testGinger() {
		espresso = new Ginger(espresso);
		greentea = new Ginger(greentea);
		assertEquals(2.3,espresso.cost(),0.0001);
		assertEquals(null+" ginger",((BeverageWithIngredient)espresso).getDescription());
		assertEquals(2.1,greentea.cost(),0.0001);
		assertEquals(null+" ginger",((BeverageWithIngredient)greentea).getDescription());
	}
	
	@Test
	public void testJasmine() {
		espresso = new Jasmine(espresso);
		greentea = new Jasmine(greentea);
		assertEquals(2.2,espresso.cost(),0.0001);
		assertEquals(null+" jasmine",((BeverageWithIngredient)espresso).getDescription());
		assertEquals(2.0,greentea.cost(),0.0001);
		assertEquals(null+" jasmine",((BeverageWithIngredient)greentea).getDescription());
	}
	
	@Test
	public void testMilk() {
		espresso = new Milk(espresso);
		greentea = new Milk(greentea);
		assertEquals(2.0,espresso.cost(),0.0001);
		assertEquals(null+" milk",((BeverageWithIngredient)espresso).getDescription());
		assertEquals(1.8,greentea.cost(),0.0001);
		assertEquals(null+" milk",((BeverageWithIngredient)greentea).getDescription());
	}
	
	@Test
	public void testWhipCream() {
		espresso = new WhipCream(espresso);
		greentea = new WhipCream(greentea);
		assertEquals(2.0,espresso.cost(),0.0001);
		assertEquals(null+" whip",((BeverageWithIngredient)espresso).getDescription());
		assertEquals(1.8,greentea.cost(),0.0001);
		assertEquals(null+" whip",((BeverageWithIngredient)greentea).getDescription());
	}
	

}
