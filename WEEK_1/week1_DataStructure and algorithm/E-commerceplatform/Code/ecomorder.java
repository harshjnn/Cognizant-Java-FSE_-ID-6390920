
public class ecomorder {
    String orderId;
    String customerName;
    double totalPrice;

    public ecomorder(String orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public String toString() {
        return orderId + " | " + customerName + " | ₹" + totalPrice;
    }
}
