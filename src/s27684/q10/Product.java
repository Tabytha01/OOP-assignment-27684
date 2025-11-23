package s27684.q10;

public class Product extends Category {
    protected String productName;
    protected String productCode;
    protected double price;

    public Product(int id, String createdDate, String updatedDate,
                   String storeName, String address, String email,
                   String categoryName, String categoryCode,
                   String productName, String productCode, double price)
            throws ShoppingException {

        super(id, createdDate, updatedDate, storeName, address, email,
                categoryName, categoryCode);

        if (price <= 0)
            throw new ShoppingException("Price must be > 0");

        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
    }
}
