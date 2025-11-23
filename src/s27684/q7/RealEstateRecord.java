package s27684.q7;

public final class RealEstateRecord extends Commission {

    public RealEstateRecord(int id, String createdDate, String updatedDate,
                            String agencyName, String location, String phoneNumber,
                            String agentName, String email, String licenseNumber,
                            String propertyCode, String propertyType, double price,
                            String sellerName, String contactNumber,
                            String buyerName, String buyerEmail,
                            String agreementDate, String terms,
                            double paymentAmount, String paymentDate,
                            double commissionRate, double commissionAmount)
            throws RealEstateException {

        super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
                agentName, email, licenseNumber,
                propertyCode, propertyType, price,
                sellerName, contactNumber,
                buyerName, buyerEmail,
                agreementDate, terms,
                paymentAmount, paymentDate,
                commissionRate, commissionAmount);
    }

    public double calculateCommission() {
        return (price * commissionRate) / 100;
    }
}
