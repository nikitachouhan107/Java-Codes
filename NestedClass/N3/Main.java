package NestedClass.N3;

public class Main {
    public static void main(String[] args){
        Library l = new Library();
        Library.Book lb = l.new Book();
        lb.info();
    }
}
