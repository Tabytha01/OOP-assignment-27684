package s27684.q1;
public class Department extends Hospital {
    private String departmentName;
    private String departmentCode;

    public Department(int id, String createdDate, String updatedDate,
                      String hospitalName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode)
            throws HospitalDataException {

        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email);

        if (departmentCode.length() < 3)
            throw new HospitalDataException("Department code must be at least 3 characters");

        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }
}
