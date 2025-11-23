package s27684.q7;

public class Buyer extends Seller {
    protected String buyerName;
    protected String buyerEmail;

    public Buyer(int id, String createdDate, String updatedDate,
                 String agencyName, String location, String phoneNumber,
                 String agentName, String email, String licenseNumber,
                 String propertyCode, String propertyType, double price,
                 String sellerName, String contactNumber,
                 String buyerName, String buyerEmail)
            throws RealEstateException {

        super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
                agentName, email, licenseNumber,
                propertyCode, propertyType, price,
                sellerName, contactNumber);

        if (!buyerEmail.contains("@"))
            throw new RealEstateException("Invalid buyer email");

        this.buyerName = buyerName;
        this.buyerEmail = buyerEmail;
    }
}

