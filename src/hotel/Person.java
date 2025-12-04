package hotel;

public abstract class Person {
    protected String name;
    protected String phone;

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public abstract void showInfo();
    public abstract void checkIn();
    public abstract void checkOut();
}
