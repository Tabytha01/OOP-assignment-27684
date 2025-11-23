package s27684.q9;

public class Invoice extends Payment {
    protected double totalFare;

    public Invoice(int id, String createdDate, String updatedDate,
                   String airlineName, String address, String contactEmail,
                   String flightNumber, String destination, String departureTime,
                   String passengerName, String passportNumber, String nationality,
                   String seatNumber, String seatType,
                   String ticketNumber, double price,
                   double baggageWeight, double baggageFee,
                   String paymentDate, String paymentMode)
            throws AirlineException {

        super(id, createdDate, updatedDate, airlineName, address, contactEmail,
                flightNumber, destination, departureTime,
                passengerName, passportNumber, nationality,
                seatNumber, seatType,
                ticketNumber, price,
                baggageWeight, baggageFee,
                paymentDate, paymentMode);

        if (price + baggageFee <= 0)
            throw new AirlineException("Total fare must be > 0");

        this.totalFare = price + baggageFee;
    }
}

