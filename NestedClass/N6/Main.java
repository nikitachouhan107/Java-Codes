package NestedClass.N6;

public class Main {
    public static void main(String[] args){
        Hospital h = new Hospital();
        Hospital.Patient hp = h.new Patient();
        hp.details();
    }
}
