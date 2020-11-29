public class Product {
    final private String name;
    final private double price;
          private int qty;

    public Product(String name, double price, int qty) {
//        System.out.println("Constructir with parameters");
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public Product(String name, double price) {
        this(name, price, 0);
    }

    public String printNameAndPrice() {
        return name+  "_" + price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void incrementQty() {
        qty++;
    }

}
