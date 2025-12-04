package hotel;

public class CardPayment extends Payment {
    private String cardType;

    public CardPayment(String guestName, double amount, String cardType) {
        super(guestName, amount);
        this.cardType = cardType;
    }

    @Override
    public void process() {
        System.out.println(guestName + " оплатив " + amount + " грн карткою (" + cardType + ")");
    }

    @Override
    public void refund() {
        System.out.println("Повернення коштів на карту для " + guestName);
    }

    @Override
    public void info() {
        System.out.println("Картковий платіж: " + amount + " грн (" + cardType + ")");
    }
}
