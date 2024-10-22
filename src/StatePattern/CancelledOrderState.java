package StatePattern;

public class CancelledOrderState implements State {
    private Order order;

    public CancelledOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order is cancelled. It cannot be paid.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Order is cancelled. It cannot be shipped.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order is cancelled. It cannot be delivered.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order is already cancelled.");
    }
}
