package s27684.q5;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws BankDataException {
        if (id <= 0) throw new BankDataException("ID must be > 0");
        if (createdDate.isEmpty() || updatedDate.isEmpty())
            throw new BankDataException("Dates cannot be empty");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
}

