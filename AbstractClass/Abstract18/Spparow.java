package AbstractClass.Abstract18;

class Spparow extends Bird{
    String color;

    Spparow(String color){
        this.color = color;
    }
    void fly(){
        System.out.println("Color"+color);
    }
}
