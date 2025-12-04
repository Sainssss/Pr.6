package hotel;

public class Service {
    String name; double price;
    public Service(String n, double p) { name = n; price = p; }
    public void use() { System.out.println("Використана послуга: " + name); }
}
