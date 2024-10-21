package StrategyPattern;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void checkOut(double amount) {
        if (paymentStrategy == null)
            System.out.println("Select a payment method");
        else
            paymentStrategy.processPayment(amount);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) { // Point 4 from the Task.
        this.paymentStrategy = paymentStrategy;
    }
}
