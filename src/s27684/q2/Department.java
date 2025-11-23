package s27684.q2;

public class Department extends School {
    protected String departmentName;
    protected String departmentCode;

    public Department(int id, String createdDate, String updatedDate,
                      String schoolName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode)
            throws ResultException {

        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email);

        if (departmentCode.length() < 3 || !departmentCode.matches("[A-Za-z0-9]+"))
            throw new ResultException("Invalid department code");

        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }
}
