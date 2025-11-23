package s27684.q2;

public class Fee extends Result {
    protected double tuitionFee;
    protected double examFee;
    protected double totalFee;

    public Fee(int id, String createdDate, String updatedDate,
               String schoolName, String address, String phoneNumber, String email,
               String departmentName, String departmentCode,
               String teacherName, String subject, String teacherEmail, String teacherPhone,
               String studentName, int rollNumber, String grade, String contactNumber,
               String courseName, String courseCode, int creditHours,
               String examName, double maxMarks, String examDate,
               double obtainedMarks, String remarks,
               double tuitionFee, double examFee, double totalFee)
            throws ResultException {

        super(id, createdDate, updatedDate,
                schoolName, address, phoneNumber, email,
                departmentName, departmentCode,
                teacherName, subject, teacherEmail, teacherPhone,
                studentName, rollNumber, grade, contactNumber,
                courseName, courseCode, creditHours,
                examName, maxMarks, examDate,
                obtainedMarks, remarks);

        if (tuitionFee <= 0 || examFee <= 0 || totalFee <= 0)
            throw new ResultException("Fee values must be > 0");

        this.tuitionFee = tuitionFee;
        this.examFee = examFee;
        this.totalFee = totalFee;
    }
}
