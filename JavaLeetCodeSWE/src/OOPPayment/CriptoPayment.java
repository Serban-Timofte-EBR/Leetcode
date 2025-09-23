package OOPPayment;

public class CriptoPayment implements Payable{
    @Override
    public void pay(double amount) {
        System.out.println("Paid with CRIPTO: -" + amount + " EUR");
    }
}
