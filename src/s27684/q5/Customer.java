package s27684.q5;

public class Customer extends Branch {
    protected String customerName;
    protected String address;
    protected String gender;

    public Customer(int id, String createdDate, String updatedDate,
                    String bankName, String email, String phone,
                    String branchName, String branchCode,
                    String customerName, String address, String gender)
            throws BankDataException {

        super(id, createdDate, updatedDate, bankName, email, phone, branchName, branchCode);

        if (!(gender.equals("Male") || gender.equals("Female") || gender.equals("Other")))
            throw new BankDataException("Invalid gender");

        this.customerName = customerName;
        this.address = address;
        this.gender = gender;
    }
}

