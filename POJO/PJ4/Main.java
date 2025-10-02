package POJO.PJ4;

public class Main {
        public static void main(String[] args) {
            Book b = new Book("Java Basics", "James Gosling");
            System.out.println(b.getTitle() + " by " + b.getAuthor());
        }
    }
