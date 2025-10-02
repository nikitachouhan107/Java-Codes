package NestedClass.N2;

public class Main {
    public static void main(String[] args){
        Car c = new Car();
        Car.Engine ce = c.new Engine();
        ce.start();

    }
}
