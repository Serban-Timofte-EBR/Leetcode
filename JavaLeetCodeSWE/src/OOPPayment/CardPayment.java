package OOPPayment;

public class CardPayment implements Payable{
    @Override
    public void pay(double amount) {
        System.out.println("Paid with CARD: -" + amount + " EUR");
    }
}
