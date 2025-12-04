package hotel;

public class CardPayment extends Payment {
    String cardType;

    public CardPayment(String gName, double amt, String type) {
        super(gName, amt); cardType = type;
    }

    @Override
    public void process() {
        System.out.println(guestName + " оплатив " + amount + " грн карткою (" + cardType + ")");
    }
}
