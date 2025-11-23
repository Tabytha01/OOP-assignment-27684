package s27684.q7;

public class Agreement extends Buyer {
    protected String agreementDate;
    protected String terms;

    public Agreement(int id, String createdDate, String updatedDate,
                     String agencyName, String location, String phoneNumber,
                     String agentName, String email, String licenseNumber,
                     String propertyCode, String propertyType, double price,
                     String sellerName, String contactNumber,
                     String buyerName, String buyerEmail,
                     String agreementDate, String terms)
            throws RealEstateException {

        super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
                agentName, email, licenseNumber,
                propertyCode, propertyType, price,
                sellerName, contactNumber,
                buyerName, buyerEmail);

        if (agreementDate.isEmpty() || terms.isEmpty())
            throw new RealEstateException("Agreement details cannot be empty");

        this.agreementDate = agreementDate;
        this.terms = terms;
    }
}
