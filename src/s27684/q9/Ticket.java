package s27684.q9;

public class Ticket extends Seat {
    protected String ticketNumber;
    protected double price;

    public Ticket(int id, String createdDate, String updatedDate,
                  String airlineName, String address, String contactEmail,
                  String flightNumber, String destination, String departureTime,
                  String passengerName, String passportNumber, String nationality,
                  String seatNumber, String seatType,
                  String ticketNumber, double price)
            throws AirlineException {

        super(id, createdDate, updatedDate, airlineName, address, contactEmail,
                flightNumber, destination, departureTime,
                passengerName, passportNumber, nationality,
                seatNumber, seatType);

        if (price <= 0)
            throw new AirlineException("Ticket price must be > 0");

        this.ticketNumber = ticketNumber;
        this.price = price;
    }
}

