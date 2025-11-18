package s27684.q2;

public class Teacher extends Department {
    private String teacherName;
    private String subject;
    private String teacherEmail;
    private String phone;

    public Teacher(int id, String createdDate, String updatedDate,
                   String schoolName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String teacherName, String subject,
                   String teacherEmail, String phone)
            throws SchoolDataException {

        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                departmentName, departmentCode);

        if (subject.isEmpty()) throw new SchoolDataException("Subject cannot be empty");
        if (!teacherEmail.contains("@")) throw new SchoolDataException("Invalid teacher email");
        if (phone.length() != 10) throw new SchoolDataException("Phone number must be 10 digits");

        this.teacherName = teacherName;
        this.subject = subject;
        this.teacherEmail = teacherEmail;
        this.phone = phone;
    }
}
