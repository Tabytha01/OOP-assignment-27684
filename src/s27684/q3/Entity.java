package s27684.q3;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws PayrollDataException {
        if (id <= 0) throw new PayrollDataException("ID must be > 0");
        if (createdDate.isEmpty() || updatedDate.isEmpty())
            throw new PayrollDataException("Dates cannot be empty");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
}

