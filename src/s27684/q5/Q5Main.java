package s27684.q5;

public class Q5Main {

    public static void main(String[] args) {

        try {
            BankRecord record = new BankRecord(
                    1, "2025-01-01", "2025-01-01",
                    "Equity Bank", "info@equity.com", "0788888888",
                    "Kigali Branch", "KB1",
                    "Tabitha Kunda", "Kigali-Rwanda", "Female",
                    "ACC1001", "Savings",
                    100000, "2025-02-05",
                    500000
            );

            System.out.println("Balance: " + record.getCurrentBalance());
            System.out.println("Student ID: 27684");

        } catch (BankDataException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
