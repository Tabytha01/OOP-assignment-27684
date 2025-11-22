package s27684.q3;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phone;
    private String email;

    public Company(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phone, String email)
            throws PayrollDataException {

        super(id, createdDate, updatedDate);

        if (phone.length() != 10) throw new PayrollDataException("Phone must be 10 digits");
        if (!email.contains("@")) throw new PayrollDataException("Invalid email");

        this.companyName = companyName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
}

