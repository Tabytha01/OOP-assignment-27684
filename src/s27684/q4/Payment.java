package s27684.q4;

public class Payment extends Booking {
    protected double amountPaid;
    protected String paymentMethod;

    public Payment(int id, String createdDate, String updatedDate,
                   String hotelName, String address, String phone, String email,
                   String roomNumber, String roomType, double pricePerNight,
                   String guestName, String gender, String contactNumber,
                   String checkInDate, String checkOutDate,
                   double amountPaid, String paymentMethod)
            throws HotelDataException {

        super(id, createdDate, updatedDate, hotelName, address, phone, email,
                roomNumber, roomType, pricePerNight,
                guestName, gender, contactNumber,
                checkInDate, checkOutDate);

        if (amountPaid < 0) throw new HotelDataException("Payment cannot be negative");

        this.amountPaid = amountPaid;
        this.paymentMethod = paymentMethod;
    }
}

