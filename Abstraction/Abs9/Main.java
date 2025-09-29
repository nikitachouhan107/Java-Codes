package Abstraction.Abs9;

public class Main {
    public static void main(String[] args) {
        Toy t1 = new CarToy();
        Toy t2 = new Doll();
        t1.play();
        t2.play();
    }
}
