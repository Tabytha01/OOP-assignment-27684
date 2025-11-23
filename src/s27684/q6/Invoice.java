package s27684.q6;

public class Invoice extends Payment {
    protected double totalCharge;

    public Invoice(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phoneNumber,
                   String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate,
                   String customerName, String licenseNumber, String contactNumber,
                   String rentalDate, String returnDate, int rentalDays,
                   double rentalCharge, double penaltyCharge,
                   String paymentMode, String transactionId)
            throws VehicleRentalException {

        super(id, createdDate, updatedDate, companyName, address, phoneNumber,
                branchName, locationCode, vehicleType, registrationNumber, dailyRate,
                customerName, licenseNumber, contactNumber,
                rentalDate, returnDate, rentalDays,
                rentalCharge, penaltyCharge,
                paymentMode, transactionId);

        if (rentalCharge + penaltyCharge <= 0)
            throw new VehicleRentalException("Total charge must be > 0");

        this.totalCharge = rentalCharge + penaltyCharge;
    }
}

