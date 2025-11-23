package s27684.q6;

public class Vehicle extends Branch {
    protected String vehicleType;
    protected String registrationNumber;
    protected double dailyRate;

    public Vehicle(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phoneNumber,
                   String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate)
            throws VehicleRentalException {

        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode);

        if (dailyRate <= 0)
            throw new VehicleRentalException("Daily rate must be greater than 0");

        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        this.dailyRate = dailyRate;
    }
}
