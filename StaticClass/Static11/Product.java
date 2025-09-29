package StaticClass.Static11;

class Product {
    String name;
    int price;

    static class Builder {
        Product build(String n, int p) {
            Product pr = new Product();
            pr.name = n;
            pr.price = p;
            return pr;
        }
    }
}
