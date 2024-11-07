package Project;

public class Calculator {
    public void add(double a, double b) {
        System.out.println("Result: " + (a + b));
    }

    public void subtract(double a, double b) {
        System.out.println("Result: " + (a - b));
    }

    public void multiply(double a, double b) {
        System.out.println("Result: " + (a * b));
    }

    public void divide(double a, double b) {
        if (b != 0) {
            System.out.println("Result: " + (a / b));
        } else {
            System.out.println("Error: Division by zero.");
        }
    }
}
