package s27684.q10;

public class Invoice extends Shipping {
    protected double totalAmount;

    public Invoice(int id, String createdDate, String updatedDate,
                   String storeName, String address, String email,
                   String categoryName, String categoryCode,
                   String productName, String productCode, double price,
                   String customerName, String contactNumber, String customerAddress,
                   String orderDate, String orderId,
                   String paymentMethod, String paymentStatus,
                   String shippingAddress, double shippingCost)
            throws ShoppingException {

        super(id, createdDate, updatedDate, storeName, address, email,
                categoryName, categoryCode,
                productName, productCode, price,
                customerName, contactNumber, customerAddress,
                orderDate, orderId,
                paymentMethod, paymentStatus,
                shippingAddress, shippingCost);

        if (price + shippingCost <= 0)
            throw new ShoppingException("Total amount must be > 0");

        this.totalAmount = price + shippingCost;
    }
}
