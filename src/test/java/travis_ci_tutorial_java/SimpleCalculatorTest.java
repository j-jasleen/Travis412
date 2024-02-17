package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {

	// Test Divide

	@Test
	public void testDivide() {
		SimpleCalculator calc3 = new SimpleCalculator();
		assertEquals(calc3.divide(6, 3), 2);
	}

	@Test
	public void testDivideByZero() {
		SimpleCalculator calcByZero = new SimpleCalculator();
		assertEquals(calcByZero.divide(6, 0), "Undefined");

	}

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

	// Test Multiply

	@Test
	public void testMultiply() {
		SimpleCalculator calc2 = new SimpleCalculator();
		assertEquals(calc2.multiply(5, 3), 15);
	}

	@Test
	public void testMultiplyZero() {
		SimpleCalculator calcZero = new SimpleCalculator();
		assertEquals(calcZero.multiply(0, 3), 0);
	}

	@Test
	public void testMultiplyNegative() {
		SimpleCalculator calcNeg = new SimpleCalculator();
		assertEquals(calcNeg.multiply(10, -3), -30);
	}

}
