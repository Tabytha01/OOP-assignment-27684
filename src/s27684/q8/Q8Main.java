package s27684.q8;

public class Q8Main {
    public static void main(String[] args) {

        try {
            LibraryRecord record = new LibraryRecord(
                    1, "2025-01-01", "2025-01-01",
                    "Kigali Library", "Kigali", "0788888888",
                    "Science", "SCI",
                    "Java Programming", "John Doe", "1234567890",
                    "Tabitha Kunda", 27684, "0788123456",
                    "2025-02-01", "2025-02-05",
                    500, 3,
                    "2025-02-06", "Cash"
            );

            System.out.println("Fine: " + record.calculateFine());
            System.out.println("Student ID: 27684");

        } catch (LibraryException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}

