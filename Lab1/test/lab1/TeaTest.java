package lab1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TeaTest {
	
	private static Beverage redteas,redteam,redteal,redteag,greenteas,greenteam,greenteal,greenteag,whiteteas,whiteteam,whiteteal,whiteteag;

	@BeforeClass
	public static void setUp() throws Exception {
		redteas = new RedTea();((TeaBeverage)redteas).setSize("small");
		redteam = new RedTea();((TeaBeverage)redteam).setSize("medium");
		redteal = new RedTea();((TeaBeverage)redteal).setSize("large");
		redteag = new RedTea();((TeaBeverage)redteag).setSize("grand");
		greenteas = new GreenTea();((TeaBeverage)greenteas).setSize("small");
		greenteam = new GreenTea();((TeaBeverage)greenteam).setSize("medium");
		greenteal = new GreenTea();((TeaBeverage)greenteal).setSize("large");
		greenteag = new GreenTea();((TeaBeverage)greenteag).setSize("grand");
		whiteteas = new WhiteTea();((TeaBeverage)whiteteas).setSize("small");
		whiteteam = new WhiteTea();((TeaBeverage)whiteteam).setSize("medium");
		whiteteal = new WhiteTea();((TeaBeverage)whiteteal).setSize("large");
		whiteteag = new WhiteTea();((TeaBeverage)whiteteag).setSize("grand");
	}

	@Test
	//test cost and description of redtea
	public void testRedTea() {
		assertEquals(1.0,redteas.cost(),0.0001);
		assertEquals(1.3,redteam.cost(),0.0001);
		assertEquals(1.5,redteal.cost(),0.0001);
		assertEquals(1.7,redteag.cost(),0.0001);
		assertEquals("Red Tea",((RedTea)redteas).getDescription());
		assertEquals("Red Tea",((RedTea)redteam).getDescription());
		assertEquals("Red Tea",((RedTea)redteal).getDescription());
		assertEquals("Red Tea",((RedTea)redteag).getDescription());
	}
	
	@Test
	//test cost and description of greentea
	public void testGreenTea() {
		assertEquals(1.2,greenteas.cost(),0.0001);
		assertEquals(1.5,greenteam.cost(),0.0001);
		assertEquals(1.7,greenteal.cost(),0.0001);
		assertEquals(1.9,greenteag.cost(),0.0001);
		assertEquals("Green Tea",((GreenTea)greenteas).getDescription());
		assertEquals("Green Tea",((GreenTea)greenteam).getDescription());
		assertEquals("Green Tea",((GreenTea)greenteal).getDescription());
		assertEquals("Green Tea",((GreenTea)greenteag).getDescription());
	}
	
	@Test
	//test cost and description of whitetea
	public void testWhiteTea() {
		assertEquals(1.2,whiteteas.cost(),0.0001);
		assertEquals(1.5,whiteteam.cost(),0.0001);
		assertEquals(1.7,whiteteal.cost(),0.0001);
		assertEquals(1.9,whiteteag.cost(),0.0001);
		assertEquals("White Tea",((WhiteTea)whiteteas).getDescription());
		assertEquals("White Tea",((WhiteTea)whiteteam).getDescription());
		assertEquals("White Tea",((WhiteTea)whiteteal).getDescription());
		assertEquals("White Tea",((WhiteTea)whiteteag).getDescription());
	}

}
