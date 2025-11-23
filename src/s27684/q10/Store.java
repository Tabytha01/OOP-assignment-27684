package s27684.q10;

public class Store extends Entity {
    protected String storeName;
    protected String address;
    protected String email;

    public Store(int id, String createdDate, String updatedDate,
                 String storeName, String address, String email)
            throws ShoppingException {
        super(id, createdDate, updatedDate);

        if (!email.contains("@"))
            throw new ShoppingException("Invalid email address");

        this.storeName = storeName;
        this.address = address;
        this.email = email;
    }
}
