package InnerClass.Inner10;

class Greetings {
    private class Hey {
        void display() {
            System.out.println("Hey from here");
        }
    }

    void callInner() {
        Hey h = new Hey();
        h.display();
    }
}
