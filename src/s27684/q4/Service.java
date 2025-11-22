package s27684.q4;

public class Service extends Payment {
    protected double serviceCharge;

    public Service(int id, String createdDate, String updatedDate,
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
                amountPaid, paymentMethod);

        if (serviceCharge < 0)
            throw new HotelDataException("Service charge cannot be negative");

        this.serviceCharge = serviceCharge;
    }
}

