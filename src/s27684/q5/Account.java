package s27684.q5;

public class Account extends Customer {
    protected String accountNumber;
    protected String accountType;

    public Account(int id, String createdDate, String updatedDate,
                   String bankName, String email, String phone,
                   String branchName, String branchCode,
                   String customerName, String address, String gender,
                   String accountNumber, String accountType)
            throws BankDataException {

        super(id, createdDate, updatedDate, bankName, email, phone,
                branchName, branchCode, customerName, address, gender);

        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }
}
