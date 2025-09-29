package StaticClass.Static18;

class Book {
    static class Hindi {
        String title;
        Hindi(String t) { title = t; }
        void show() { System.out.println("Book: " + title); }
    }
}
