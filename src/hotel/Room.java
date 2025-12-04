package hotel;

public class Room {
    int number; String type; double price;
    public Room(int num, String t, double p) { number = num; type = t; price = p; }
    public void showInfo() { System.out.println("Кімната " + number + " (" + type + "), Ціна: " + price); }
}
