package hotel;

public class Payment {
    String guestName;
    double amount;

    public Payment(String gName, double amt) { guestName = gName; amount = amt; }
    public void process() { System.out.println(guestName + " оплатив " + amount + " грн"); }
}
