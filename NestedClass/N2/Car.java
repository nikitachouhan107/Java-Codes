package NestedClass.N2;

class Car {
    private String model = "Tesla";

    class Engine {
        void start() {
            System.out.println(model + " Engine started...");
        }
    }
}
