package s27684.q9;

public class Passenger extends Flight {
    protected String passengerName;
    protected String passportNumber;
    protected String nationality;

    public Passenger(int id, String createdDate, String updatedDate,
                     String airlineName, String address, String contactEmail,
                     String flightNumber, String destination, String departureTime,
                     String passengerName, String passportNumber, String nationality)
            throws AirlineException {

        super(id, createdDate, updatedDate, airlineName, address, contactEmail,
                flightNumber, destination, departureTime);

        if (passportNumber.isEmpty())
            throw new AirlineException("Passport cannot be empty");

        this.passengerName = passengerName;
        this.passportNumber = passportNumber;
        this.nationality = nationality;
    }
}

