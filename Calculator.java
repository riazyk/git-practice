
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

public int subtract(int a, int b) {
    return a - b;
}

public double divide(double a, double b) {
    if (b == 0) {
        throw new ArithmeticException("Division by zero");
    }
    return a / b;
}

public int multiply(int a, int b) {
    return a * b;
}

public double sqrt(double number) {
    if (number < 0) {
        throw new IllegalArgumentException("Cannot calculate square root of a negative number");
    }
    return Math.sqrt(number);
}
}
