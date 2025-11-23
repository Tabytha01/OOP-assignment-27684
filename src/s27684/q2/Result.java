package s27684.q2;

public class Result extends Exam {
    protected double obtainedMarks;
    protected String remarks;

    public Result(int id, String createdDate, String updatedDate,
                  String schoolName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String teacherName, String subject, String teacherEmail, String teacherPhone,
                  String studentName, int rollNumber, String grade, String contactNumber,
                  String courseName, String courseCode, int creditHours,
                  String examName, double maxMarks, String examDate,
                  double obtainedMarks, String remarks)
            throws ResultException {

        super(id, createdDate, updatedDate,
                schoolName, address, phoneNumber, email,
                departmentName, departmentCode,
                teacherName, subject, teacherEmail, teacherPhone,
                studentName, rollNumber, grade, contactNumber,
                courseName, courseCode, creditHours,
                examName, maxMarks, examDate);

        if (obtainedMarks < 0)
            throw new ResultException("Obtained marks must be >= 0");

        if (remarks.isEmpty())
            throw new ResultException("Remarks cannot be empty");

        this.obtainedMarks = obtainedMarks;
        this.remarks = remarks;
    }
}
