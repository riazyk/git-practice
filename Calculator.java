
public class Calculator {

    public int add(int a, int b) {
        System.out.println("Adding two numbers: " + a + " and " + b);
        return a + b;
    }

    public int add(int a, int b, int c) {
        System.out.println("Adding 3 numbers");
        return a + b + c;
    }

    public int add(int a, int b, int c, int d) {
        System.out.println("Adding 4 numbers");
        return a + b + c + d;
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
            throw new IllegalArgumentException(
                "Cannot calculate square root of a negative number"
            );
        }
        return Math.sqrt(number);
    }
}
