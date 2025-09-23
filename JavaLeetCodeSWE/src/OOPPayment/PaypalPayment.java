package OOPPayment;

public class PaypalPayment implements Payable{
    @Override
    public void pay(double amount) {
        System.out.println("Paid with PAYPAL: -" + amount + " EUR");
    }
}
