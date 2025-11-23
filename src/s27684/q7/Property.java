package s27684.q7;

public class Property extends Agent {
    protected String propertyCode;
    protected String propertyType;
    protected double price;

    public Property(int id, String createdDate, String updatedDate,
                    String agencyName, String location, String phoneNumber,
                    String agentName, String email, String licenseNumber,
                    String propertyCode, String propertyType, double price)
            throws RealEstateException {

        super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
                agentName, email, licenseNumber);

        if (price <= 0)
            throw new RealEstateException("Price must be greater than 0");

        this.propertyCode = propertyCode;
        this.propertyType = propertyType;
        this.price = price;
    }
}

