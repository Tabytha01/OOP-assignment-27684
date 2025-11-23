package s27684.q2;

public class Q2Main {
    public static void main(String[] args) {
        try {

            StudentRecord record = new StudentRecord(
                    1, "2025-01-01", "2025-01-02",
                    "Green Hills Academy", "Kigali", "0788888888", "school@gmail.com",
                    "Science", "SCI101",
                    "Mr. John", "Math", "john@gmail.com", "0780000000",
                    "Tabitha Kunda", 27684, "A", "0787777777",
                    "Computer Science", "CS101", 4,
                    "Midterm", 100, "2025-02-01",
                    85, "Good performance",
                    500000, 100000, 600000
            );

            System.out.println("Average Marks: " + record.calculateAverageMarks());
            System.out.println("Student ID: 27684");

        } catch (ResultException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
