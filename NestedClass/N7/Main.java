package NestedClass.N7;

public class Main {
    public static void main(String[] args){
        Hotel h = new Hotel();
        Hotel.Order ho = h.new Order();
        ho.confirm();
    }
}
