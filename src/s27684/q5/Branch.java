package s27684.q5;

public class Branch extends Bank {
    protected String branchName;
    protected String branchCode;

    public Branch(int id, String createdDate, String updatedDate,
                  String bankName, String email, String phone,
                  String branchName, String branchCode)
            throws BankDataException {

        super(id, createdDate, updatedDate, bankName, email, phone);

        if (branchCode.length() < 3)
            throw new BankDataException("Branch code must be at least 3 characters");

        this.branchName = branchName;
        this.branchCode = branchCode;
    }
}

