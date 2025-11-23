package s27684.q6;

public class Company extends Entity {
    protected String companyName;
    protected String address;
    protected String phoneNumber;

    public Company(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phoneNumber)
            throws VehicleRentalException {

        super(id, createdDate, updatedDate);

        if (phoneNumber.length() != 10)
            throw new VehicleRentalException("Phone number must be 10 digits");

        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}

