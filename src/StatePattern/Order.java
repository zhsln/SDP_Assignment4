package StatePattern;

public class Order {
    private State newState;
    private State paidState;
    private State shippedState;
    private State deliveredState;
    private State cancelledState;

    private State state;

    public Order() {
        newState = new NewOrderState(this);
        paidState = new PaidOrderState(this);
        shippedState = new ShippedOrderState(this);
        deliveredState = new DeliveredOrderState(this);
        cancelledState = new CancelledOrderState(this);

        // All states are new by default.
        state = newState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void payOrder() {
        state.payOrder();
    }

    public void shipOrder() {
        state.shipOrder();
    }

    public void deliverOrder() {
        state.deliverOrder();
    }

    public void cancelOrder() {
        state.cancelOrder();
    }

    public State getNewState() { return newState; }
    public State getPaidState() { return paidState; }
    public State getShippedState() { return shippedState; }
    public State getDeliveredState() { return deliveredState; }
    public State getCancelledState() { return cancelledState; }
}

