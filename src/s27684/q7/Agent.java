package s27684.q7;

public class Agent extends Agency {
    protected String agentName;
    protected String email;
    protected String licenseNumber;

    public Agent(int id, String createdDate, String updatedDate,
                 String agencyName, String location, String phoneNumber,
                 String agentName, String email, String licenseNumber)
            throws RealEstateException {

        super(id, createdDate, updatedDate, agencyName, location, phoneNumber);

        if (!email.contains("@"))
            throw new RealEstateException("Invalid email");

        this.agentName = agentName;
        this.email = email;
        this.licenseNumber = licenseNumber;
    }
}

