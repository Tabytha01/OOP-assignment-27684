package s27684.q1;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws HospitalDataException {
        if (id <= 0) throw new HospitalDataException("ID must be > 0");
        if (createdDate == null || createdDate.isEmpty() ||
                updatedDate == null || updatedDate.isEmpty()) {
            throw new HospitalDataException("Dates cannot be empty");
        }

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
}
