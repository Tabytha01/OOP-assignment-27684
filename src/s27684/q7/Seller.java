
package s27684.q7;

public class Seller extends Property {
    protected String sellerName;
    protected String contactNumber;

    public Seller(int id, String createdDate, String updatedDate,
                  String agencyName, String location, String phoneNumber,
                  String agentName, String email, String licenseNumber,
                  String propertyCode, String propertyType, double price,
                  String sellerName, String contactNumber)
            throws RealEstateException {

        super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
                agentName, email, licenseNumber,
                propertyCode, propertyType, price);

        if (sellerName.isEmpty() || contactNumber.isEmpty())
            throw new RealEstateException("Seller details cannot be empty");

        this.sellerName = sellerName;
        this.contactNumber = contactNumber;
    }
}
