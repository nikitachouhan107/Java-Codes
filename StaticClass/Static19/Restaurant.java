package StaticClass.Static19;

class Restaurant {
    static class Menu {
        String dish;
        Menu(String dish) {
            this.dish = dish;
        }
        void show() { System.out.println("Dish: " + dish); }
    }
}