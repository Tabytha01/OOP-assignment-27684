package s27684.q7;

public class Payment extends Agreement {
    protected double paymentAmount;
    protected String paymentDate;

    public Payment(int id, String createdDate, String updatedDate,
                   String agencyName, String location, String phoneNumber,
                   String agentName, String email, String licenseNumber,
                   String propertyCode, String propertyType, double price,
                   String sellerName, String contactNumber,
                   String buyerName, String buyerEmail,
                   String agreementDate, String terms,
                   double paymentAmount, String paymentDate)
            throws RealEstateException {

        super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
                agentName, email, licenseNumber,
                propertyCode, propertyType, price,
                sellerName, contactNumber,
                buyerName, buyerEmail,
                agreementDate, terms);

        if (paymentAmount <= 0)
            throw new RealEstateException("Payment must be > 0");

        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }
}
