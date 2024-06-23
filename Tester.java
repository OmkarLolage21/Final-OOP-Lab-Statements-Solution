import java.util.Scanner;

class Order{
    int orderId;
    String orderedFoods;
    double totalPrice;
    String status;

    static {
        System.out.println("Order status: Ordered");
    }

    public Order(int orderId,String orderedFoods){
        this.orderId = orderId;
        this.orderedFoods = orderedFoods;
        this.status = "Ordered";
    }
    void calculateTotalPrice(int unitPrice){
        totalPrice = unitPrice + unitPrice * 0.05;
//        return totalPrice;
    }
    public void displayOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Order Id: " + orderId);
        System.out.println("Ordered Food: " + orderedFoods);
        System.out.println("Order status: " + status);
        System.out.println("Total Price: " + totalPrice);
    }
}
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order order = new Order(101, "Burger");
        order.calculateTotalPrice(49);
        order.displayOrderDetails();
    }
}
//11