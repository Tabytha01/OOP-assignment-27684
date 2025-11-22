package s27684.q3;

public class Deduction extends Allowance {
    protected double taxAmount;
    protected double pensionAmount;

    public Deduction(int id, String createdDate, String updatedDate,
                     String companyName, String address, String phone, String email,
                     String departmentName, String departmentCode,
                     String employeeName, String employeeId, String gender,
                     String contractType, String startDate,
                     double basicSalary,
                     double transportAllowance, double housingAllowance,
                     double taxAmount, double pensionAmount)
            throws PayrollDataException {

        super(id, createdDate, updatedDate, companyName, address, phone, email,
                departmentName, departmentCode,
                employeeName, employeeId, gender,
                contractType, startDate,
                basicSalary, transportAllowance, housingAllowance);

        if (taxAmount < 0 || pensionAmount < 0)
            throw new PayrollDataException("Deduction cannot be negative");

        this.taxAmount = taxAmount;
        this.pensionAmount = pensionAmount;
    }
}
