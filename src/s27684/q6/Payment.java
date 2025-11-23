package s27684.q6;

public class Payment extends Charge {
    protected String paymentMode;
    protected String transactionId;

    public Payment(int id, String createdDate, String updatedDate,
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
                rentalDate, returnDate, rentalDays, rentalCharge, penaltyCharge);

        if (paymentMode.isEmpty() || transactionId.isEmpty())
            throw new VehicleRentalException("Payment details cannot be empty");

        this.paymentMode = paymentMode;
        this.transactionId = transactionId;
    }
}

