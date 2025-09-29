package StaticClass.Static14;

class Library {
    private String name;

    Library(String name) {
        this.name = name;
    }

    static class Book {
        private String title;
        private String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        void display() {
            System.out.println("Book: " + title + " by " + author);
        }
    }
}
