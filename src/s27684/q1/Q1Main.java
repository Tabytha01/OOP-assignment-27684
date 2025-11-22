package s27684.q1;
import java.util.Scanner;

public class Q1Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            HospitalRecord record = new HospitalRecord(
                    1, "2025-01-01", "2025-01-01",
                    "Kigali Hospital", "Kigali", "0788888888", "hospital@example.com",
                    "General", "GEN",
                    "Dr. John", "Surgeon", "dr.john@example.com", "0799999999",
                    "Nurse Mary", "Day", 5,
                    "Patient A", 30, "Male", "0780000000",
                    "2025-01-01", "101", 50000,
                    "Flu", "Medicine", 15000,
                    20000, 10000
            );

            System.out.println("Final Bill: " + record.generateBill());
            System.out.println("StudentID: 27684");

        } catch (HospitalDataException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}

