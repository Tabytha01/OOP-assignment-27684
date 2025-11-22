package s27684.q4;

public class Invoice extends Service {
    protected double totalAmount;

    public Invoice(int id, String createdDate, String updatedDate,
                   String hotelName, String address, String phone, String email,
                   String roomNumber, String roomType, double pricePerNight,
                   String guestName, String gender, String contactNumber,
                   String checkInDate, String checkOutDate,
                   double amountPaid, String paymentMethod,
                   double serviceCharge)
            throws HotelDataException {

        super(id, createdDate, updatedDate, hotelName, address, phone, email,
                roomNumber, roomType, pricePerNight,
                guestName, gender, contactNumber,
                checkInDate, checkOutDate,
                amountPaid, paymentMethod,
                serviceCharge);

        this.totalAmount = amountPaid + serviceCharge;
    }
}

