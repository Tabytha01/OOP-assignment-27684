package s27684.q3;

public class Contract extends Employee {
    private String contractType;
    private String startDate;

    public Contract(int id, String createdDate, String updatedDate,
                    String companyName, String address, String phone, String email,
                    String departmentName, String departmentCode,
                    String employeeName, String employeeId, String gender,
                    String contractType, String startDate)
            throws PayrollDataException {

        super(id, createdDate, updatedDate, companyName, address, phone, email,
                departmentName, departmentCode, employeeName, employeeId, gender);

        if (contractType.isEmpty()) throw new PayrollDataException("Contract type cannot be empty");
        if (startDate.isEmpty()) throw new PayrollDataException("Start date cannot be empty");

        this.contractType = contractType;
        this.startDate = startDate;
    }
}

