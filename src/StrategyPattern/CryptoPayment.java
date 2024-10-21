package StrategyPattern;

public class CryptoPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment with crypto wallet: " + amount); // I guess it should be with wallet...
    }
}
