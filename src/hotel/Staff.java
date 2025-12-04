package hotel;

public class Staff extends Person {
    String position;
    public Staff(String n, String ph, String pos) { super(n, ph); position = pos; }
    @Override
    public void showInfo() { System.out.println(name + ", " + position + ", Тел: " + phone); }
}
