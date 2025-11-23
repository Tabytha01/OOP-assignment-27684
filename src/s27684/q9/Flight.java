package s27684.q9;

public class Flight extends Airline {
    protected String flightNumber;
    protected String destination;
    protected String departureTime;

    public Flight(int id, String createdDate, String updatedDate,
                  String airlineName, String address, String contactEmail,
                  String flightNumber, String destination, String departureTime)
            throws AirlineException {

        super(id, createdDate, updatedDate, airlineName, address, contactEmail);

        if (flightNumber.isEmpty() || destination.isEmpty() || departureTime.isEmpty())
            throw new AirlineException("Flight fields cannot be empty");

        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }
}

