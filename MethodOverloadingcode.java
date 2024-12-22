class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingcode {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println("The sum of intergers is: " + cal.sum(10, 10));
        System.out.println("The sum of doubles is: " + cal.sum(20.0, 10.0));

    }
}
