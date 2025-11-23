package s27684.q2;

public class Student extends Teacher {
    protected String studentName;
    protected int rollNumber;
    protected String grade;
    protected String contactNumber;

    public Student(int id, String createdDate, String updatedDate,
                   String schoolName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String teacherName, String subject, String teacherEmail, String teacherPhone,
                   String studentName, int rollNumber, String grade, String contactNumber)
            throws ResultException {

        super(id, createdDate, updatedDate,
                schoolName, address, phoneNumber, email,
                departmentName, departmentCode,
                teacherName, subject, teacherEmail, teacherPhone);

        if (rollNumber <= 0)
            throw new ResultException("Roll number must be > 0");

        if (grade.isEmpty())
            throw new ResultException("Grade cannot be empty");

        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.contactNumber = contactNumber;
    }
}
