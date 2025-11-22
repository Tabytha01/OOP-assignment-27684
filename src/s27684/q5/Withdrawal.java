package s27684.q5;

public class Withdrawal extends Transaction {

    public Withdrawal(int id, String createdDate, String updatedDate,
                      String bankName, String email, String phone,
                      String branchName, String branchCode,
                      String customerName, String address, String gender,
                      String accountNumber, String accountType,
                      double amount, String date)
            throws BankDataException {
        super(id, createdDate, updatedDate, bankName, email, phone,
                branchName, branchCode, customerName, address, gender,
                accountNumber, accountType, amount, date);
    }
}

