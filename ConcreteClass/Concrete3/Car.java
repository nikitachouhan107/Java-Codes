package ConcreteClass.Concrete3;

class Car {
    String type;
    int price;

    Car(String type, int Price){
        this.type = type;
        this.price = price;
    }

    void run(){
        System.out.println("Type: " + type + " Price: " + price);
    }
}
