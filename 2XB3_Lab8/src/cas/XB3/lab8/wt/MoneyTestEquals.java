package cas.XB3.lab6.wt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MoneyTestEquals {
	/**
	 * @throws java.lang.Exception
	 */
	
	private Money f12CAD;
	private Money f14CAD;
	
	
	
	@Before
	public void setup() throws Exception {
	f12CAD = new Money(12, "CAD");
	f14CAD = new Money(14, "CAD");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link cas.XB3.lab6.wt.Money#add(cas.XB3.lab6.wt.Money)}.
	 */
	/**
	 * Test method for {@link cas.XB3.lab6.wt.Money#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObject() {
		assertTrue(!f12CAD.equals(null));
		assertEquals(f12CAD, f12CAD);
		assertEquals(f12CAD, new Money(12, "CAD"));
		assertTrue(!f12CAD.equals(f14CAD));
	}

}
