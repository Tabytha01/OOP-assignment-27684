package s27684.q10;

public class Q10Main {
    public static void main(String[] args) {

        try {
            OrderRecord record = new OrderRecord(
                    1, "2025-01-01", "2025-01-01",
                    "Glint Store", "Kigali", "support@glint.com",
                    "Beauty", "BEA123",
                    "Lip Gloss", "LG001", 15000,
                    "Tabitha Kunda", "0788888888", "Kigali-Rwanda",
                    "2025-02-01", "ORD123",
                    "Mobile Money", "PAID",
                    "Kigali-Rwanda", 2000
            );

            System.out.println("Total Amount: " + record.calculateTotalAmount());
            System.out.println("Student ID: 27684");

        } catch (ShoppingException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
