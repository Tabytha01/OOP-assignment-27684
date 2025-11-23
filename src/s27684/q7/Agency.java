package s27684.q7;

public class Agency extends Entity {
    protected String agencyName;
    protected String location;
    protected String phoneNumber;

    public Agency(int id, String createdDate, String updatedDate,
                  String agencyName, String location, String phoneNumber)
            throws RealEstateException {

        super(id, createdDate, updatedDate);

        if (phoneNumber.length() != 10)
            throw new RealEstateException("Phone number must be 10 digits");

        this.agencyName = agencyName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }
}
