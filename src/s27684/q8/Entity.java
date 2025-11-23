package s27684.q8;

public class Entity {
    protected int id;
    protected String createdDate;
    protected String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws LibraryException {
        if (id <= 0) throw new LibraryException("ID must be > 0");
        if (createdDate.isEmpty() || updatedDate.isEmpty())
            throw new LibraryException("Dates cannot be empty");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
}

