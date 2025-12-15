package formcom.ecommerce;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        while (true) {
            System.out.println("\n🌱 FARMER TO CONSUMER E-COMMERCE 🌱");
            System.out.println("1. Farmer Login 👨‍🌾");
            System.out.println("2. User Login 🛒");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                Farmer.farmerMenu(products);
            } 
            else if (choice == 2) {
                User.userMenu(products);
            } 
            else {
                System.out.println("Thank you!");
                break;
            }
        }
    }
}