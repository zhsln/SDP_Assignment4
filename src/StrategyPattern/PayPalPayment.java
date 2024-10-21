package StrategyPattern;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment with PayPal: " + amount);
    }
}
