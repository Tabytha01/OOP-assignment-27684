package s27684.q9;

public class Seat extends Passenger {
    protected String seatNumber;
    protected String seatType;

    public Seat(int id, String createdDate, String updatedDate,
                String airlineName, String address, String contactEmail,
                String flightNumber, String destination, String departureTime,
                String passengerName, String passportNumber, String nationality,
                String seatNumber, String seatType)
            throws AirlineException {

        super(id, createdDate, updatedDate, airlineName, address, contactEmail,
                flightNumber, destination, departureTime,
                passengerName, passportNumber, nationality);

        if (!(seatType.equals("Economy") || seatType.equals("Business")))
            throw new AirlineException("Seat type must be Economy or Business");

        this.seatNumber = seatNumber;
        this.seatType = seatType;
    }
}

