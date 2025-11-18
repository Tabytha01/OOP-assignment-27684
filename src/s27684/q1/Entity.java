package s27684.q1;

import java.awt.*;

public class Entity {
    private int   id;
    private String createdDate;
    private String updatedDate;
    public Entity(int id, String createdDate, String updatedDate) throws HospitalDataException {
        if (id <= 0) throw new HeadlessException("ID mustbe >0");
        if (createdDate == null) || createdDate.isEmpty() ||
                updatedDate == null || updated.isEmpty()){
    throw new HeadlessException("Dates cannot be empty");
        }
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
}
