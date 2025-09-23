package OOPPayment;

public class Main {
    public static void main(String[] args) {
        Checkout checkout = new Checkout(new CriptoPayment());

        checkout.pay(4343.65);
    }
}
