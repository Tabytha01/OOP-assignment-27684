package s27684.q4;

public class Hotel extends Entity {
    private String hotelName;
    private String address;
    private String phone;
    private String email;

    public Hotel(int id, String createdDate, String updatedDate,
                 String hotelName, String address, String phone, String email)
            throws HotelDataException {

        super(id, createdDate, updatedDate);

        if (phone.length() != 10) throw new HotelDataException("Phone must be 10 digits");
        if (!email.contains("@")) throw new HotelDataException("Invalid email");

        this.hotelName = hotelName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
}

