package FinalClass.Final12;

final class Car {
    Engine engine = new Engine();

    void drive() {
        engine.start();
        System.out.println("Car is running...");
    }
}
