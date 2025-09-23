package OOPPayment;

public class Checkout {
    private Payable paymentEngine;

    public Checkout(Payable paymentEngine) {
        this.paymentEngine = paymentEngine;
    }

    public void pay(double amount) {
        this.paymentEngine.pay(amount);
    }
}
