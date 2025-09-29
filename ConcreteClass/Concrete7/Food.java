package ConcreteClass.Concrete7;

class Food {
    String type;
    int price;

    Food(String type, int price){
        this.type = type;
        this.price = price;
    }

    void eat(){
        System.out.println("Type: " + type + "Price: " + price);
    }
}
