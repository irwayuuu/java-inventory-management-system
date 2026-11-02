public class Product {
    private String productId;
    private String name;
    private int stockQuantity;
    private double price;

    public Product(String productId, String name, int stockQuantity, double price) {
        this.productId = productId;
        this.name = name;
        this.stockQuantity = stockQuantity;
        this.price = price;
    }

    public String getProductId() { return productId; }
    public String getName() { return name; }
    public int getStockQuantity() { return stockQuantity; }
    public double getPrice() { return price; }

    public void updateStock(int quantity) {
        this.stockQuantity += quantity;
    }

    public void displayDetails() {
        System.out.println("ID: " + productId + " | Name: " + name + " | Stock: " + stockQuantity + " | Price: RM " + price);
    }
}