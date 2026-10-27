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
}