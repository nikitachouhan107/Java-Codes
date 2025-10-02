package NestedClass.N10;

public class Main {
    public static void main(String[] args){
        State s = new State();
        State.City sc = s.new City();
        sc.details();
    }
}
