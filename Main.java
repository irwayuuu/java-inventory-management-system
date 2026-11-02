import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== UNIMAS Object-Oriented Inventory Management System ===");
        
        List<Product> inventory = new ArrayList<>();
        inventory.add(new Product("P001", "Wireless Mouse", 45, 35.00));
        inventory.add(new Product("P002", "Mechanical Keyboard", 20, 150.00));

        for (Product p : inventory) {
            p.displayDetails();
        }
    }
}