package StatePattern;

public class PaidOrderState implements State {
    private Order order;

    public PaidOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order is already paid.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Order is shipped.");
        order.setState(order.getShippedState());
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
