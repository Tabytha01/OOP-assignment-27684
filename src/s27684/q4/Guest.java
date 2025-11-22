package s27684.q4;

public class Guest extends Room {
    private String guestName;
    private String gender;
    private String contactNumber;

    public Guest(int id, String createdDate, String updatedDate,
                 String hotelName, String address, String phone, String email,
                 String roomNumber, String roomType, double pricePerNight,
                 String guestName, String gender, String contactNumber)
            throws HotelDataException {

        super(id, createdDate, updatedDate, hotelName, address, phone, email,
                roomNumber, roomType, pricePerNight);

        if (!(gender.equals("Male") || gender.equals("Female") || gender.equals("Other")))
            throw new HotelDataException("Gender must be Male/Female/Other");

        this.guestName = guestName;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }
}

