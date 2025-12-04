package hotel;

public class Guest extends Person {
    String email;
    public Guest(String n, String ph, String em) { super(n, ph); email = em; }
    @Override
    public void showInfo() { System.out.println(name + ", " + phone + ", " + email); }
}
