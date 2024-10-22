package StatePattern;

public class NewOrderState implements State {
    private Order order;

    public NewOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order paid successfully.");
        order.setState(order.getPaidState());
    }

    @Override
    public void shipOrder() {
        System.out.println("Order cannot be shipped until it is paid.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order cannot be delivered until it is shipped.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order is cancelled.");
        order.setState(order.getCancelledState());
    }
}
