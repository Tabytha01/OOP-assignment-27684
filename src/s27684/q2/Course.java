package s27684.q2;

public class Course extends Student {
    protected String courseName;
    protected String courseCode;
    protected int creditHours;

    public Course(int id, String createdDate, String updatedDate,
                  String schoolName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String teacherName, String subject, String teacherEmail, String teacherPhone,
                  String studentName, int rollNumber, String grade, String contactNumber,
                  String courseName, String courseCode, int creditHours)
            throws ResultException {

        super(id, createdDate, updatedDate,
                schoolName, address, phoneNumber, email,
                departmentName, departmentCode,
                teacherName, subject, teacherEmail, teacherPhone,
                studentName, rollNumber, grade, contactNumber);

        if (creditHours <= 0)
            throw new ResultException("Credit hours must be > 0");

        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditHours = creditHours;
    }
}
