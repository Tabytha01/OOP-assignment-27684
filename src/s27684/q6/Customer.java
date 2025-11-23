package s27684.q6;

public class Customer extends Vehicle {
    protected String customerName;
    protected String licenseNumber;
    protected String contactNumber;

    public Customer(int id, String createdDate, String updatedDate,
                    String companyName, String address, String phoneNumber,
                    String branchName, String locationCode,
                    String vehicleType, String registrationNumber, double dailyRate,
                    String customerName, String licenseNumber, String contactNumber)
            throws VehicleRentalException {

        super(id, createdDate, updatedDate, companyName, address, phoneNumber,
                branchName, locationCode, vehicleType, registrationNumber, dailyRate);

        if (licenseNumber.isEmpty())
            throw new VehicleRentalException("License number cannot be empty");

        this.customerName = customerName;
        this.licenseNumber = licenseNumber;
        this.contactNumber = contactNumber;
    }
}

