package s27684.q9;

public class Q9Main {
    public static void main(String[] args) {

        try {
            TicketRecord record = new TicketRecord(
                    1, "2025-01-01", "2025-01-01",
                    "RwandAir", "Kigali", "info@rwandair.com",
                    "WB400", "Nairobi", "10:00AM",
                    "Tabitha Kunda", "PA12345", "Rwandan",
                    "12A", "Economy",
                    "TCK1001", 150000,
                    20, 10000,
                    "2025-02-01", "Credit Card"
            );

            System.out.println("Total Fare: " + record.generateInvoice());
            System.out.println("Student ID: 27684");

        } catch (AirlineException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}

