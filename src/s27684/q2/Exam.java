package s27684.q2;

public class Exam extends Course {
    protected String examName;
    protected double maxMarks;
    protected String examDate;

    public Exam(int id, String createdDate, String updatedDate,
                String schoolName, String address, String phoneNumber, String email,
                String departmentName, String departmentCode,
                String teacherName, String subject, String teacherEmail, String teacherPhone,
                String studentName, int rollNumber, String grade, String contactNumber,
                String courseName, String courseCode, int creditHours,
                String examName, double maxMarks, String examDate)
            throws ResultException {

        super(id, createdDate, updatedDate,
                schoolName, address, phoneNumber, email,
                departmentName, departmentCode,
                teacherName, subject, teacherEmail, teacherPhone,
                studentName, rollNumber, grade, contactNumber,
                courseName, courseCode, creditHours);

        if (maxMarks <= 0)
            throw new ResultException("Max marks must be > 0");

        if (examDate.isEmpty())
            throw new ResultException("Exam date cannot be empty");

        this.examName = examName;
        this.maxMarks = maxMarks;
        this.examDate = examDate;
    }

    public double getMaxMarks() {
        return maxMarks;
    }
}
