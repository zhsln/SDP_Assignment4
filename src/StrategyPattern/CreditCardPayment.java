package StrategyPattern;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment with credit card: " + amount);
    }
}
