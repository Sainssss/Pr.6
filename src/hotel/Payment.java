package hotel;

public abstract class Payment {
    protected String guestName;
    protected double amount;

    public Payment(String guestName, double amount) {
        this.guestName = guestName;
        this.amount = amount;
    }

    public abstract void process();
    public abstract void refund();
    public abstract void info();
}
