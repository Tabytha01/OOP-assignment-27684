package s27684.q4;

public class Room extends Hotel {
    private String roomNumber;
    private String roomType;
    private double pricePerNight;

    public Room(int id, String createdDate, String updatedDate,
                String hotelName, String address, String phone, String email,
                String roomNumber, String roomType, double pricePerNight)
            throws HotelDataException {

        super(id, createdDate, updatedDate, hotelName, address, phone, email);

        if (pricePerNight <= 0)
            throw new HotelDataException("Room price must be > 0");

        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }
}
