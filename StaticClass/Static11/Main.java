package StaticClass.Static11;

public class Main {
    public static void main(String[] args) {
        Product p = new Product.Builder().build("Laptop", 55000);
        System.out.println(p.name + " - " + p.price);
    }
}
