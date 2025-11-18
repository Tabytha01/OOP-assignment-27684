package s27684.q2;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws SchoolDataException {
        if (id <= 0) throw new SchoolDataException("ID must be greater than 0");
        if (createdDate == null || createdDate.isEmpty() ||
                updatedDate == null || updatedDate.isEmpty())
            throw new SchoolDataException("Dates cannot be empty");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
}

