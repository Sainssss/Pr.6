package hotel;

public class CashPayment extends Payment {
    public CashPayment(String guestName, double amount) {
        super(guestName, amount);
    }

    @Override
    public void process() {
        System.out.println(guestName + " оплатив " + amount + " грн готівкою.");
    }

    @Override
    public void refund() {
        System.out.println("Повернення готівки для " + guestName);
    }

    @Override
    public void info() {
        System.out.println("Готівковий платіж: " + amount + " грн");
    }
}
