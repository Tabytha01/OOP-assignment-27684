package s27684.q5;
public class Transaction extends Account {
    protected double amount;
    protected String date;

    public Transaction(int id, String createdDate, String updatedDate,
                       String bankName, String email, String phone,
                       String branchName, String branchCode,
                       String customerName, String address, String gender,
                       String accountNumber, String accountType,
                       double amount, String date)
            throws BankDataException {

        super(id, createdDate, updatedDate, bankName, email, phone,
                branchName, branchCode, customerName, address, gender,
                accountNumber, accountType);

        if (amount < 0) throw new BankDataException("Amount cannot be negative");

        this.amount = amount;
        this.date = date;
    }
}
