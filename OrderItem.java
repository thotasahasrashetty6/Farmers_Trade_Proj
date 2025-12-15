package formcom.ecommerce;
public class OrderItem {
    String productName;
    double quantity;
    double price;

    public OrderItem(String productName, double quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
}
