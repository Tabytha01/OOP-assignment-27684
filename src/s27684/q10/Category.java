package s27684.q10;

public class Category extends Store {
    protected String categoryName;
    protected String categoryCode;

    public Category(int id, String createdDate, String updatedDate,
                    String storeName, String address, String email,
                    String categoryName, String categoryCode)
            throws ShoppingException {

        super(id, createdDate, updatedDate, storeName, address, email);

        if (categoryCode.length() < 3)
            throw new ShoppingException("Category code must be ≥ 3 characters");

        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }
}

