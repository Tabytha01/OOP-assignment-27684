package s27684.q4;

public class Q4Main {
    public static void main(String[] args) {

        try {
            ReservationRecord record = new ReservationRecord(
                    1, "2025-01-01", "2025-01-01",
                    "Serena Hotel", "Kigali", "0788888888", "info@serena.com",
                    "101", "Deluxe", 90000,
                    "Tabitha", "Female", "0781234567",
                    "2025-02-01", "2025-02-05",
                    360000, "Mobile Money",
                    20000
            );

            System.out.println("Total Amount: " + record.getTotalAmount());
            System.out.println("Student ID: 27684");

        } catch (HotelDataException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}

