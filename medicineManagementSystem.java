import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Medicine {
    private String name;
    private double price;
    private int quantity;

    public Medicine(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class MedicineStore {
    private List<Medicine> inventory;
    private double revenue;

    public MedicineStore() {
        this.inventory = new ArrayList<>();
        this.revenue = 0.0;
    }

    public void addMedicine(Medicine medicine) {
        inventory.add(medicine);
    }

    public void sellMedicine(String medicineName, int quantity) {
        for (Medicine medicine : inventory) {
            if (medicine.getName().equalsIgnoreCase(medicineName)) {
                if (medicine.getQuantity() >= quantity) {
                    double totalCost = medicine.getPrice() * quantity;
                    medicine.setQuantity(medicine.getQuantity() - quantity);
                    revenue += totalCost;
                    System.out.println(quantity + " units of " + medicineName + " sold for $" + totalCost);
                    return;
                } else {
                    System.out.println("Insufficient quantity of " + medicineName + " in stock.");
                    return;
                }
            }
        }
        System.out.println("Medicine not found in inventory.");
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        for (Medicine medicine : inventory) {
            System.out.println("Medicine: " + medicine.getName() +
                    ", Price: Rs" + medicine.getPrice() +
                    ", Quantity: " + medicine.getQuantity());
        }
    }

    public void displayRevenue() {
        System.out.println("Total Revenue: Rs:" + revenue);
    }
}

public class medicineManagementSystem {
    public static void main(String[] args) {
        MedicineStore store = new MedicineStore();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Medicine Store Management System ---");
            System.out.println("1. Add Medicine");
            System.out.println("2. Sell Medicine");
            System.out.println("3. Display Inventory");
            System.out.println("4. Display Revenue");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter medicine name: ");
                    String name = scanner.next();
                    System.out.print("Enter medicine price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter medicine quantity: ");
                    int quantity = scanner.nextInt();
                    Medicine medicine = new Medicine(name, price, quantity);
                    store.addMedicine(medicine);
                    System.out.println("Medicine added successfully.");
                    break;
                case 2:
                    System.out.print("Enter medicine name to sell: ");
                    String medicineName = scanner.next();
                    System.out.print("Enter quantity to sell: ");
                    int sellQuantity = scanner.nextInt();
                    store.sellMedicine(medicineName, sellQuantity);
                    break;
                case 3:
                    store.displayInventory();
                    break;
                case 4:
                    store.displayRevenue();
                    break;
                case 0:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
