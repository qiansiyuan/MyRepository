import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class App_LeapTest {
	App_Leap leap;
	@Before
	public void setUp() throws Exception {
		leap=new App_Leap();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsLeap1() {
		assertEquals(true, leap.isLeap(2000));
	}
	@Test
	public void testIsLeap2() {
		assertEquals(false, leap.isLeap(2100));
	}@Test
	public void testIsLeap3() {
		assertEquals(true, leap.isLeap(2008));
	}@Test
	public void testIsLeap4() {
		assertEquals(false, leap.isLeap(1999));
	}
}
