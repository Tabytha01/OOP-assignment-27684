package s27684.q10;

public class Payment extends Order {
    protected String paymentMethod;
    protected String paymentStatus;

    public Payment(int id, String createdDate, String updatedDate,
                   String storeName, String address, String email,
                   String categoryName, String categoryCode,
                   String productName, String productCode, double price,
                   String customerName, String contactNumber, String customerAddress,
                   String orderDate, String orderId,
                   String paymentMethod, String paymentStatus)
            throws ShoppingException {

        super(id, createdDate, updatedDate, storeName, address, email,
                categoryName, categoryCode,
                productName, productCode, price,
                customerName, contactNumber, customerAddress,
                orderDate, orderId);

        if (paymentMethod.isEmpty() || paymentStatus.isEmpty())
            throw new ShoppingException("Payment fields cannot be empty");

        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }
}

