package s27684.q9;

public class Payment extends Baggage {
    protected String paymentDate;
    protected String paymentMode;

    public Payment(int id, String createdDate, String updatedDate,
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
                baggageWeight, baggageFee);

        if (paymentDate.isEmpty() || paymentMode.isEmpty())
            throw new AirlineException("Payment fields cannot be empty");

        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
    }
}

