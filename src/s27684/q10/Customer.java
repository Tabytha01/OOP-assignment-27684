package s27684.q10;

public class Customer extends Product {
    protected String customerName;
    protected String contactNumber;
    protected String customerAddress;

    public Customer(int id, String createdDate, String updatedDate,
                    String storeName, String address, String email,
                    String categoryName, String categoryCode,
                    String productName, String productCode, double price,
                    String customerName, String contactNumber, String customerAddress)
            throws ShoppingException {

        super(id, createdDate, updatedDate, storeName, address, email,
                categoryName, categoryCode,
                productName, productCode, price);

        if (customerName.isEmpty() || contactNumber.isEmpty() || customerAddress.isEmpty())
            throw new ShoppingException("Customer fields cannot be empty");

        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.customerAddress = customerAddress;
    }
}
