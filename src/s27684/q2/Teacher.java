package s27684.q2;

public class Teacher extends Department {
    protected String teacherName;
    protected String subject;
    protected String teacherEmail;
    protected String phone;

    public Teacher(int id, String createdDate, String updatedDate,
                   String schoolName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String teacherName, String subject, String teacherEmail, String phone)
            throws ResultException {

        super(id, createdDate, updatedDate,
                schoolName, address, phoneNumber, email,
                departmentName, departmentCode);

        if (subject.isEmpty())
            throw new ResultException("Subject cannot be empty");

        if (!teacherEmail.contains("@"))
            throw new ResultException("Invalid email");

        if (!phone.matches("[0-9]{10}"))
            throw new ResultException("Invalid phone number");

        this.teacherName = teacherName;
        this.subject = subject;
        this.teacherEmail = teacherEmail;
        this.phone = phone;
    }
}
