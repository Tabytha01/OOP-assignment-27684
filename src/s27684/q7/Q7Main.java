package s27684.q7;

public class Q7Main {
    public static void main(String[] args) {

        try {
            RealEstateRecord record = new RealEstateRecord(
                    1, "2025-01-01", "2025-01-01",
                    "Prime Agency", "Kigali", "0788888888",
                    "Keza Malaika", "agent@prime.com", "LIC2025",
                    "PR100", "House", 50000000,
                    "Seller John", "0789000000",
                    "Buyer Alice", "alice@gmail.com",
                    "2025-02-01", "Valid terms here",
                    20000000, "2025-02-02",
                    5, 2500000
            );

            System.out.println("Commission: " + record.calculateCommission());
            System.out.println("Student ID: 27684");

        } catch (RealEstateException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
