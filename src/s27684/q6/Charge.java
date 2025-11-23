package s27684.q6;

public class Charge extends Rental {
    protected double rentalCharge;
    protected double penaltyCharge;

    public Charge(int id, String createdDate, String updatedDate,
                  String companyName, String address, String phoneNumber,
                  String branchName, String locationCode,
                  String vehicleType, String registrationNumber, double dailyRate,
                  String customerName, String licenseNumber, String contactNumber,
                  String rentalDate, String returnDate, int rentalDays,
                  double rentalCharge, double penaltyCharge)
            throws VehicleRentalException {

        super(id, createdDate, updatedDate, companyName, address, phoneNumber,
                branchName, locationCode, vehicleType, registrationNumber, dailyRate,
                customerName, licenseNumber, contactNumber,
                rentalDate, returnDate, rentalDays);

        if (rentalCharge < 0 || penaltyCharge < 0)
            throw new VehicleRentalException("Charges cannot be negative");

        this.rentalCharge = rentalCharge;
        this.penaltyCharge = penaltyCharge;
    }
}

