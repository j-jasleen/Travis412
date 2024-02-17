package travis_ci_tutorial_java;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int minus(int c, int d) {
		return c - d;
	}

	public int multiply(int e, int f) {
		return e * f;
	}

	public int divide(int g, int h) {

		if (h == 0) {
			throw new ArithmeticException("Division by zero");

		} else {
			return g / h;
		}
	}
}
