package s27684.q2;

public class School extends Entity {
    protected String schoolName;
    protected String address;
    protected String phoneNumber;
    protected String email;

    public School(int id, String createdDate, String updatedDate,
                  String schoolName, String address, String phoneNumber, String email)
            throws ResultException {

        super(id, createdDate, updatedDate);

        if (!phoneNumber.matches("[0-9]{10}"))
            throw new ResultException("Invalid phone number");

        if (!email.contains("@"))
            throw new ResultException("Invalid email");

        this.schoolName = schoolName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
