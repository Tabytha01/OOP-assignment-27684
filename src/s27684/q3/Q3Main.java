package s27684.q3;

public class Q3Main {
    public static void main(String[] args) {

        try {
            EmployeeRecord record = new EmployeeRecord(
                    1, "2025-01-01", "2025-01-01",
                    "Tech Ltd", "Kigali", "0788888888", "info@tech.com",
                    "IT", "IT001",
                    "Tabitha", "EMP27684", "Female",
                    "Full-Time", "2025-01-01",
                    300000, 50000, 80000,
                    40000, 20000
            );

            System.out.println("Net Salary: " + record.calculateNetSalary());
            System.out.println("Student ID: 27684");

        } catch (PayrollDataException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}

