package AbstractClass.Abstract23;

abstract class Pen {
    String color;
    int price;

    Pen(String color, int price){
        this.color = color;
        this.price = price;
    }
    abstract void write();
}
