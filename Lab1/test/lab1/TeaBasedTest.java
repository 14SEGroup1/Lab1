package lab1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TeaBasedTest {
    private TeaBased tea;
	@Before
	public void setUp() throws Exception {
		tea = new TeaBased();
	}

	@Test
	public void testSizeCost() {
		assertEquals(0.2,tea.sizeCost("small"),0.0001);
		assertEquals(0.5,tea.sizeCost("medium"),0.0001);
		assertEquals(0.7,tea.sizeCost("large"),0.0001);
		assertEquals(0.9,tea.sizeCost("grand"),0.0001);
	}

}
