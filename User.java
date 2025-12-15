package formcom.ecommerce;
import java.util.*;
public class User {
    static Scanner sc = new Scanner(System.in);
    public static void userMenu(List<Product> products) {
        System.out.print("Enter Your Name: ");
        String customerName = sc.next();
        System.out.print("Enter Mobile Number: ");
        String customerMobile = sc.next();
        Bill bill = new Bill(customerName, customerMobile);
        while (true) {
            System.out.println("\n🛒 AVAILABLE PRODUCTS");
            for (Product p : products) {
                System.out.println(
                        p.id + ". " + p.name +
                        " | Farmer: " + p.farmerName +
                        " (" + p.farmerMobile + ")" +
                        " | ₹" + p.pricePerHalfKg +
                        " per 0.5kg | Qty: " + p.quantity + "kg"
                );
            }
            System.out.print("Enter Product ID to buy (0 to checkout): ");
            int id = sc.nextInt();
            if (id == 0) break;

            Product selected = null;
            for (Product p : products) {
                if (p.id == id) {
                    selected = p;
                    break;
                }
            }

            if (selected == null) {
                System.out.println("❌ Invalid product ID");
                continue;
            }

            System.out.print("Enter quantity (multiples of 0.5kg): ");
            double qty = sc.nextDouble();

            if (qty > selected.quantity) {
                System.out.println("❌ Not enough stock available");
                continue;
            }

            double price = (qty / 0.5) * selected.pricePerHalfKg;
            selected.quantity -= qty;

            bill.addItem(new OrderItem(selected.name, qty, price));
            System.out.println("✅ Item added to order");
        }

        bill.printBill();
        System.out.println("🙏 Order placed successfully. Thank you for supporting farmers!");
    }
}
