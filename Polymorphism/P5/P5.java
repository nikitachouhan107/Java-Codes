package Polymorphism.P5;

class Phone{
    void message(String text){
        System.out.println("Hello,"+text);
    }
}
public class P5 {
    public static void main(String[] args){
        Phone p = new Phone();
        p.message("how are you");
    }
}