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
		espresso.addDescription(" chocolate");
		greentea.addDescription(" chocolate");
		espresso = new Chocolate(espresso);
		greentea = new Chocolate(greentea);
		assertEquals(2.0,espresso.cost(),0.0001);
		assertEquals("Espresso chocolate",(espresso).getDescription());
		assertEquals(1.8,greentea.cost(),0.0001);
		assertEquals("Green Tea chocolate",(greentea).getDescription());
	}
	
	@Test
	public void testGinger() {
		espresso.addDescription(" ginger");
		greentea.addDescription(" ginger");
		espresso = new Ginger(espresso);
		greentea = new Ginger(greentea);
		assertEquals(2.3,espresso.cost(),0.0001);
		assertEquals("Espresso ginger",(espresso).getDescription());
		assertEquals(2.1,greentea.cost(),0.0001);
		assertEquals("Green Tea ginger",(greentea).getDescription());
	}
	
	@Test
	public void testJasmine() {
		espresso.addDescription(" jasmine");
		greentea.addDescription(" jasmine");
		espresso = new Jasmine(espresso);
		greentea = new Jasmine(greentea);
		assertEquals(2.2,espresso.cost(),0.0001);
		assertEquals("Espresso jasmine",(espresso).getDescription());
		assertEquals(2.0,greentea.cost(),0.0001);
		assertEquals("Green Tea jasmine",(greentea).getDescription());
	}
	
	@Test
	public void testMilk() {
		espresso.addDescription(" milk");
		greentea.addDescription(" milk");
		espresso = new Milk(espresso);
		greentea = new Milk(greentea);
		assertEquals(2.0,espresso.cost(),0.0001);
		assertEquals("Espresso milk",(espresso).getDescription());
		assertEquals(1.8,greentea.cost(),0.0001);
		assertEquals("Green Tea milk",(greentea).getDescription());
	}
	
	@Test
	public void testWhipCream() {
		espresso.addDescription(" whip");
		greentea.addDescription(" whip");
		espresso = new WhipCream(espresso);
		greentea = new WhipCream(greentea);
		assertEquals(2.0,espresso.cost(),0.0001);
		assertEquals("Espresso whip",(espresso).getDescription());
		assertEquals(1.8,greentea.cost(),0.0001);
		assertEquals("Green Tea whip",(greentea).getDescription());
	}
	

}
