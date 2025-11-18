package s27684.q1;

public class Doctor extends Department {
    private String doctorName;
    private String specialization;
    private String doctorEmail;
    private String doctorPhone;

    public Doctor(int id, String createdDate, String updatedDate,
                  String hospitalName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode, String doctorName,
                  String specialization, String doctorEmail, String doctorPhone)
            throws HospitalDataException {

        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                departmentName, departmentCode);

        if (specialization.isEmpty())
            throw new HospitalDataException("Specialization cannot be empty");
        if (!doctorEmail.contains("@"))
            throw new HospitalDataException("Invalid doctor email");
        if (doctorPhone.length() != 10)
            throw new HospitalDataException("Doctor phone must be 10 digits");

        this.doctorName = doctorName;
        this.specialization = specialization;
        this.doctorEmail = doctorEmail;
        this.doctorPhone = doctorPhone;
    }
}

