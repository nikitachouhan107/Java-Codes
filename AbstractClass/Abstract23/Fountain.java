package AbstractClass.Abstract23;

class Fountain extends Pen {
    Fountain(String color, int price){
        super(color, price);
    }
    void write(){
        System.out.println("Color: "+color+"Price :"+price);
    }
}
