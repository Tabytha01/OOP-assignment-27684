package s27684.q9;

public class Entity {
    protected int id;
    protected String createdDate;
    protected String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws AirlineException {
        if (id <= 0) throw new AirlineException("ID must be > 0");
        if (createdDate.isEmpty() || updatedDate.isEmpty())
            throw new AirlineException("Dates cannot be empty");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
}
