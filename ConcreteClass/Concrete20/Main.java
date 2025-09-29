package ConcreteClass.Concrete20;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.add(5, 10));
        System.out.println("Product: " + calc.multiply(5, 10));
    }
}
