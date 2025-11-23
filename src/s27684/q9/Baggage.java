package s27684.q9;

public class Baggage extends Ticket {
    protected double baggageWeight;
    protected double baggageFee;

    public Baggage(int id, String createdDate, String updatedDate,
                   String airlineName, String address, String contactEmail,
                   String flightNumber, String destination, String departureTime,
                   String passengerName, String passportNumber, String nationality,
                   String seatNumber, String seatType,
                   String ticketNumber, double price,
                   double baggageWeight, double baggageFee)
            throws AirlineException {

        super(id, createdDate, updatedDate, airlineName, address, contactEmail,
                flightNumber, destination, departureTime,
                passengerName, passportNumber, nationality,
                seatNumber, seatType,
                ticketNumber, price);

        if (baggageFee < 0)
            throw new AirlineException("Baggage fee cannot be negative");

        this.baggageWeight = baggageWeight;
        this.baggageFee = baggageFee;
    }
}

