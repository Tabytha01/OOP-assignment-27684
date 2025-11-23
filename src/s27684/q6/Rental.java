package s27684.q6;


public class Rental extends Customer {
    protected String rentalDate;
    protected String returnDate;
    protected int rentalDays;

    public Rental(int id, String createdDate, String updatedDate,
                  String companyName, String address, String phoneNumber,
                  String branchName, String locationCode,
                  String vehicleType, String registrationNumber, double dailyRate,
                  String customerName, String licenseNumber, String contactNumber,
                  String rentalDate, String returnDate, int rentalDays)
            throws VehicleRentalException {

        super(id, createdDate, updatedDate, companyName, address, phoneNumber,
                branchName, locationCode, vehicleType, registrationNumber, dailyRate,
                customerName, licenseNumber, contactNumber);

        if (rentalDays <= 0)
            throw new VehicleRentalException("Rental days must be > 0");

        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.rentalDays = rentalDays;
    }
}

