import java.sql.*;

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
    private Connection connection;

    public MedicineStore() {
        try {
            // Connect to the SQLite database
            connection = DriverManager.getConnection("jdbc:sqlite:medicine_store.db");

            // Create a table to store medicine information if it doesn't exist
            String createTableQuery = "CREATE TABLE IF NOT EXISTS medicines (" +
                    "name TEXT PRIMARY KEY," +
                    "price REAL," +
                    "quantity INTEGER)";
            Statement statement = connection.createStatement();
            statement.execute(createTableQuery);
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void addMedicine(Medicine medicine) {
        try {
            // Prepare the INSERT query
            String insertQuery = "INSERT INTO medicines (name, price, quantity) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, medicine.getName());
            preparedStatement.setDouble(2, medicine.getPrice());
            preparedStatement.setInt(3, medicine.getQuantity());

            // Execute the INSERT query
            preparedStatement.executeUpdate();
            System.out.println("Medicine added successfully.");
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void sellMedicine(String medicineName, int quantity) {
        try {
            // Check if the medicine exists in the database
            String selectQuery = "SELECT * FROM medicines WHERE name = ?";
            PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
            selectStatement.setString(1, medicineName);
            ResultSet resultSet = selectStatement.executeQuery();

            if (resultSet.next()) {
                int currentQuantity = resultSet.getInt("quantity");

                if (currentQuantity >= quantity) {
                    // Calculate the total cost and update the quantity
                    double price = resultSet.getDouble("price");
                    double totalCost = price * quantity;
                    int updatedQuantity = currentQuantity - quantity;

                    // Prepare the UPDATE query
                    String updateQuery = "UPDATE medicines SET quantity = ? WHERE name = ?";
                    PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                    updateStatement.setInt(1, updatedQuantity);
                    updateStatement.setString(2, medicineName);

                    // Execute the UPDATE query
                    updateStatement.executeUpdate();

                    System.out.println(quantity + " units of " + medicineName + " sold for $" + totalCost);
                } else {
                    System.out.println("Insufficient quantity of " + medicineName + " in stock.");
                }
            } else {
                System.out.println("Medicine not found in inventory.");
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void displayInventory() {
        try {
            // Retrieve all medicines from the database
            String selectQuery = "SELECT * FROM medicines";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);

            System.out.println("Inventory:");
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int quantity = resultSet.getInt("quantity");

                System.out.println("Medicine: " + name +
                        ", Price: $" + price +
                        ", Quantity: " + quantity);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void displayRevenue() {
        try {
            // Calculate the total revenue from the sold medicines
            String selectQuery = "SELECT SUM(price * quantity) AS revenue FROM medicines";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);

            if (resultSet.next()) {
                double revenue = resultSet.getDouble("revenue");
                System.out.println("Total Revenue: $" + revenue);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

public class project {
    public static void main(String[] args) {
        MedicineStore store = new MedicineStore();
        // ...
        // Rest of the code remains the same
        // ...
        store.closeConnection();
    }
}