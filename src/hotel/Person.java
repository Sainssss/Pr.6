package hotel;

public class Person {
    String name, phone;
    public Person(String n, String ph) { name = n; phone = ph; }
    public void showInfo() { System.out.println(name + ", Тел: " + phone); }
}
