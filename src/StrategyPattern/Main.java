package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.setPaymentStrategy(new CreditCardPayment());
        shoppingCart.checkOut(2500);

        shoppingCart.setPaymentStrategy(new PayPalPayment());
        shoppingCart.checkOut(5000);

        shoppingCart.setPaymentStrategy(new CryptoPayment());
        shoppingCart.checkOut(10000);
    }
}
