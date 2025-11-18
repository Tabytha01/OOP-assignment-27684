package s27684.q2;

public class School extends Entity {
    private String schoolName;
    private String address;
    private String phoneNumber;
    private String email;

    public School(int id, String createdDate, String updatedDate,
                  String schoolName, String address,
                  String phoneNumber, String email)
            throws SchoolDataException {

        super(id, createdDate, updatedDate);

        if (!email.contains("@")) throw new SchoolDataException("Invalid email format");
        if (phoneNumber.length() != 10) throw new SchoolDataException("Phone number must be 10 digits");

        this.schoolName = schoolName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
