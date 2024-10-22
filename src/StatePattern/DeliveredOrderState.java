package StatePattern;

public class DeliveredOrderState implements State {
    private Order order;

    public DeliveredOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order is already paid.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Order is already shipped.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order is already delivered.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cannot be cancelled after delivery.");
    }
}
