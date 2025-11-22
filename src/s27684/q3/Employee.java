package s27684.q3;

public class Employee extends Department {
    private String employeeName;
    private String employeeId;
    private String gender;

    public Employee(int id, String createdDate, String updatedDate,
                    String companyName, String address, String phone, String email,
                    String departmentName, String departmentCode,
                    String employeeName, String employeeId, String gender)
            throws PayrollDataException {

        super(id, createdDate, updatedDate, companyName, address, phone, email,
                departmentName, departmentCode);

        if (!(gender.equals("Male") || gender.equals("Female")))
            throw new PayrollDataException("Gender must be Male or Female");

        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.gender = gender;
    }
}
