package formcom.ecommerce;
import java.util.*;

public class Farmer {
    static Scanner sc = new Scanner(System.in);
    static int productId = 1;

    public static void farmerMenu(List<Product> products) {

        System.out.print("Enter Farmer Name: ");
        String farmerName = sc.next();

        System.out.print("Enter Mobile Number: ");
        String farmerMobile = sc.next();

        while (true) {
            System.out.println("\n👨‍🌾 FARMER MENU");
            System.out.println("1. Add Product");
            System.out.println("2. View My Products");
            System.out.println("3. Logout");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Product Name: ");
                String name = sc.next();

                System.out.print("Price per 0.5 kg: ");
                double price = sc.nextDouble();

                System.out.print("Available Quantity (kg): ");
                double qty = sc.nextDouble();

                products.add(new Product(
                        productId++, name, price, qty, farmerName, farmerMobile
                ));

                System.out.println("✅ Product added successfully");
            }
            else if (choice == 2) {
                System.out.println("\n📦 My Products:");
                for (Product p : products) {
                    if (p.farmerName.equals(farmerName)
                            && p.farmerMobile.equals(farmerMobile)) {

                        System.out.println(p.id + ". " + p.name +
                                " | ₹" + p.pricePerHalfKg +
                                " per 0.5kg | Qty: " + p.quantity + "kg");
                    }
                }
            }
            else {
                break;
            }
        }
    }
}
