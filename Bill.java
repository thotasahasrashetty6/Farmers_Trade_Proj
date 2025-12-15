package formcom.ecommerce;
import java.util.*;

public class Bill {
    String customerName;
    String mobileNumber;
    List<OrderItem> items = new ArrayList<>();
    double totalAmount = 0;

    public Bill(String customerName, String mobileNumber) {
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
    }

    public void addItem(OrderItem item) {
        items.add(item);
        totalAmount += item.price;
    }

    public void printBill() {
        System.out.println("\n🧾 FINAL BILL");
        System.out.println("------------------------------------");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("------------------------------------");

        for (OrderItem i : items) {
            System.out.println(i.productName +
                    " | Qty: " + i.quantity + " kg | ₹" + i.price);
        }

        System.out.println("------------------------------------");
        System.out.println("TOTAL AMOUNT: ₹" + totalAmount);
    }
}


