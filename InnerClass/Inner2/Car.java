package InnerClass.Inner2;

class Car {
    String brand = "Tesla";

    class Engine {
        void show() {
            System.out.println("Car brand: " + brand);
        }
    }
}
