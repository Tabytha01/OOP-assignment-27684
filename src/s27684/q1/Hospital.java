package s27684.q1;

public class Hospital extends Entity {
    private String hospitalName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hospital(int id, String createdDate, String updatedDate,
                    String hospitalName, String address, String phoneNumber, String email)
            throws HospitalDataException {

        super(id, createdDate, updatedDate);

        if (phoneNumber.length() != 10)
            throw new HospitalDataException("Phone number must be 10 digits");
        if (!email.contains("@"))
            throw new HospitalDataException("Invalid email format");

        this.hospitalName = hospitalName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
