package formcom.ecommerce;
public class Product {
    int id;
    String name;
    double pricePerHalfKg;
    double quantity; // in kg
    String farmerName;
    String farmerMobile;

    public Product(int id, String name, double pricePerHalfKg,
                   double quantity, String farmerName, String farmerMobile) {
        this.id = id;
        this.name = name;
        this.pricePerHalfKg = pricePerHalfKg;
        this.quantity = quantity;
        this.farmerName = farmerName;
        this.farmerMobile = farmerMobile;
    }
}
