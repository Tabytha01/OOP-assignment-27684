package s27684.q10;

public class Shipping extends Payment {
    protected String shippingAddress;
    protected double shippingCost;

    public Shipping(int id, String createdDate, String updatedDate,
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
                paymentMethod, paymentStatus);

        if (shippingCost < 0)
            throw new ShoppingException("Shipping cost cannot be negative");

        this.shippingAddress = shippingAddress;
        this.shippingCost = shippingCost;
    }
}
