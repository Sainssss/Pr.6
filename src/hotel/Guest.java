package hotel;

public class Guest extends Person {
    private String email;

    public Guest(String name, String phone, String email) {
        super(name, phone); // вызов конструктора Person
        this.email = email;
    }

    @Override
    public void showInfo() {
        System.out.println("Гість: " + name + ", Телефон: " + phone + ", Email: " + email);
    }

    @Override
    public void checkIn() {
        System.out.println(name + " заселився у готель.");
    }

    @Override
    public void checkOut() {
        System.out.println(name + " виселився з готелю.");
    }
}
