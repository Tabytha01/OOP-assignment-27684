package s27684.q10;

public class Order extends Customer {
    protected String orderDate;
    protected String orderId;

    public Order(int id, String createdDate, String updatedDate,
                 String storeName, String address, String email,
                 String categoryName, String categoryCode,
                 String productName, String productCode, double price,
                 String customerName, String contactNumber, String customerAddress,
                 String orderDate, String orderId)
            throws ShoppingException {

        super(id, createdDate, updatedDate, storeName, address, email,
                categoryName, categoryCode,
                productName, productCode, price,
                customerName, contactNumber, customerAddress);

        if (orderDate.isEmpty() || orderId.isEmpty())
            throw new ShoppingException("Order fields cannot be empty");

        this.orderDate = orderDate;
        this.orderId = orderId;
    }
}
