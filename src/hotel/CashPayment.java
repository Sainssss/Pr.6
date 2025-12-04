package hotel;

public class CashPayment extends Payment {
    public CashPayment(String gName, double amt) { super(gName, amt); }
    @Override
    public void process() { System.out.println(guestName + " оплатив " + amount + " грн готівкою"); }
}
