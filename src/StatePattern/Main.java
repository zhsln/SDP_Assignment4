package StatePattern;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.payOrder();

        order.deliverOrder(); // Test :D (cannot be delivered until is shipped.)

        order.payOrder(); // Test :D (is already paid)

        order.deliverOrder();

        order.shipOrder();

        order.deliverOrder();

        order.cancelOrder();
    }
}
