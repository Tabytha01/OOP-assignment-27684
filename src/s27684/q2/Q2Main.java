package s27684.q2;

public class Q2Main {
    public static void main(String[] args) {

        try {
            StudentRecord record = new StudentRecord(
                    1, "2025-01-01", "2025-01-01",
                    "Kigali School", "Kigali", "0788888888", "school@example.com",
                    "Science", "SCI",
                    "Mr. Peter", "Math", "peter@example.com", "0799999999",
                    "Tabitha", 27684, "A", "0781234567",
                    "Java Programming", "JAVA101", 4,
                    "Midterm", 100, "2025-06-01",
                    85, "Good work",
                    50000, 10000
            );

            System.out.println("Average Marks: " + record.calculateAverageMarks());
            System.out.println("Total Fee: " + record.totalFee);
            System.out.println("Student ID: 27684");

        } catch (SchoolDataException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}

