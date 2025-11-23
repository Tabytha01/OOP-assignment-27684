package s27684.q9;

public class Airline extends Entity {
    protected String airlineName;
    protected String address;
    protected String contactEmail;

    public Airline(int id, String createdDate, String updatedDate,
                   String airlineName, String address, String contactEmail)
            throws AirlineException {
        super(id, createdDate, updatedDate);

        if (!contactEmail.contains("@"))
            throw new AirlineException("Invalid email");

        this.airlineName = airlineName;
        this.address = address;
        this.contactEmail = contactEmail;
    }
}

