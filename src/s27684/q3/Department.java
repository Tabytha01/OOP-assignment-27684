package s27684.q3;

public class Department extends Company {
    private String departmentName;
    private String departmentCode;

    public Department(int id, String createdDate, String updatedDate,
                      String companyName, String address, String phone, String email,
                      String departmentName, String departmentCode)
            throws PayrollDataException {

        super(id, createdDate, updatedDate, companyName, address, phone, email);

        if (departmentCode.length() < 3)
            throw new PayrollDataException("Department code must be ≥ 3 characters");

        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }
}

