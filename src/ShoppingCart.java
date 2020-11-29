public class ShoppingCart {
    private Product[] cart = new Product[5];

    public void addProduct(Product newProduct, int index) {
        cart[index] = newProduct;
    }

    public void addProduct(String name, double price, int index) {
//        cart[index] =
    }
}
