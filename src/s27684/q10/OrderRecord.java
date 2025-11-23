package s27684.q10;

public final class OrderRecord extends Invoice {

    public OrderRecord(int id, String createdDate, String updatedDate,
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
    }

    public double calculateTotalAmount() {
        return price + shippingCost;
    }
}
