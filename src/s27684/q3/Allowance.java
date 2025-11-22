package s27684.q3;

public class Allowance extends Salary {
    protected double transportAllowance;
    protected double housingAllowance;

    public Allowance(int id, String createdDate, String updatedDate,
                     String companyName, String address, String phone, String email,
                     String departmentName, String departmentCode,
                     String employeeName, String employeeId, String gender,
                     String contractType, String startDate,
                     double basicSalary,
                     double transportAllowance, double housingAllowance)
            throws PayrollDataException {

        super(id, createdDate, updatedDate, companyName, address, phone, email,
                departmentName, departmentCode, employeeName, employeeId, gender,
                contractType, startDate, basicSalary);

        if (transportAllowance < 0 || housingAllowance < 0)
            throw new PayrollDataException("Allowance cannot be negative");

        this.transportAllowance = transportAllowance;
        this.housingAllowance = housingAllowance;
    }
}

