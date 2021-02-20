public abstract class Product {
    private String productID;

    public Product(String productID) {
        this.productID = productID;
    }

    public abstract double getPrice();
}
