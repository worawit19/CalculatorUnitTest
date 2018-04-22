import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		
		assertEquals(cal.add(50,10),60);
	}
	
	@Test
	public void testMinus() {
		Calculator cal = new Calculator();
		assertEquals(cal.minus(50,10),40);
	
	}
	@Test
	public void testMultiply() {
		Calculator cal = new Calculator();
		assertEquals(cal.multiply(50,10),500);
	}

}
