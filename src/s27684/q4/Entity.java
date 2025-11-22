package s27684.q4;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws HotelDataException {
        if (id <= 0) throw new HotelDataException("ID must be greater than 0");
        if (createdDate.isEmpty() || updatedDate.isEmpty())
            throw new HotelDataException("Dates cannot be empty");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
}

