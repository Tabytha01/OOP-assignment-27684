package s27684.q3;

public class Salary extends Contract {
    protected double basicSalary;

    public Salary(int id, String createdDate, String updatedDate,
                  String companyName, String address, String phone, String email,
                  String departmentName, String departmentCode,
                  String employeeName, String employeeId, String gender,
                  String contractType, String startDate,
                  double basicSalary)
            throws PayrollDataException {

        super(id, createdDate, updatedDate, companyName, address, phone, email,
                departmentName, departmentCode, employeeName, employeeId, gender,
                contractType, startDate);

        if (basicSalary <= 0) throw new PayrollDataException("Basic salary must be > 0");

        this.basicSalary = basicSalary;
    }
}
