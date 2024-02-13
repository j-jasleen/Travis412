package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	@Test
	public void testMinus() {
		SimpleCalculator calc1 = new SimpleCalculator();
		assertEquals(calc1.minus(5, 3), 2);
	}
	
	@Test
	public void testMultiply() {
		SimpleCalculator calc2 = new SimpleCalculator();
		assertEquals(calc2.multiply(5, 3), 15);
	}
	@Test
	public void testDivide() {
		SimpleCalculator calc3 = new SimpleCalculator();
		assertEquals(calc3.divide(6, 3), 3);
	}
	}

