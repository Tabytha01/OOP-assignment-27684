package s27684.q2;

public class Department extends School {
    private String departmentName;
    private String departmentCode;

    public Department(int id, String createdDate, String updatedDate,
                      String schoolName, String address,
                      String phoneNumber, String email,
                      String departmentName, String departmentCode)
            throws SchoolDataException {

        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email);

        if (departmentCode.length() < 3)
            throw new SchoolDataException("Department code must be at least 3 characters");

        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }
}

