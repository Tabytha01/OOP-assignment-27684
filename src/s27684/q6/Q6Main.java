package s27684.q6;


public class Q6Main {
    public static void main(String[] args) {
        try {
            RentalRecord record = new RentalRecord(
                    1, "2025-01-01", "2025-01-01",
                    "Simeon Rentals", "Kigali", "0788888888",
                    "CityBranch", "CB1",
                    "SUV", "RAA123B", 60000,
                    "Tabitha Kunda", "LN1022", "0788888888",
                    "2025-02-01", "2025-02-03", 2,
                    120000, 5000,
                    "Mobile Money", "TXN9001"
            );

            System.out.println("Total Charge: " + record.calculateTotalCharge());
            System.out.println("Student ID: 27684");

        } catch (VehicleRentalException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}

