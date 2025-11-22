package s27684.q4;

public class Booking extends Guest {
    private String checkInDate;
    private String checkOutDate;

    public Booking(int id, String createdDate, String updatedDate,
                   String hotelName, String address, String phone, String email,
                   String roomNumber, String roomType, double pricePerNight,
                   String guestName, String gender, String contactNumber,
                   String checkInDate, String checkOutDate)
            throws HotelDataException {

        super(id, createdDate, updatedDate, hotelName, address, phone, email,
                roomNumber, roomType, pricePerNight,
                guestName, gender, contactNumber);

        if (checkInDate.isEmpty() || checkOutDate.isEmpty())
            throw new HotelDataException("Dates cannot be empty");

        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }
}
