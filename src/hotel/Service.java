package hotel;

public abstract class Service {
    protected String name;
    protected double price;

    public Service(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void use();
    public abstract void getServiceInfo();
    public abstract double calculateCost();
}
