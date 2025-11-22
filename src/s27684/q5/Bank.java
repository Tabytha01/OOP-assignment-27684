package s27684.q5;

public class Bank extends Entity {
    protected String bankName;
    protected String email;
    protected String phone;

    public Bank(int id, String createdDate, String updatedDate,
                String bankName, String email, String phone)
            throws BankDataException {

        super(id, createdDate, updatedDate);

        if (!email.contains("@"))
            throw new BankDataException("Invalid email");
        if (phone.length() != 10)
            throw new BankDataException("Phone must be 10 digits");

        this.bankName = bankName;
        this.email = email;
        this.phone = phone;
    }
}

