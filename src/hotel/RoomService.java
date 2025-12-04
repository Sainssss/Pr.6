package hotel;

public class RoomService extends Service {
    private int roomNumber;

    public RoomService(String name, double price, int roomNumber) {
        super(name, price);
        this.roomNumber = roomNumber;
    }

    @Override
    public void use() {
        System.out.println("Послуга для кімнати " + roomNumber + ": " + name);
    }

    @Override
    public void getServiceInfo() {
        System.out.println("RoomService: " + name + ", Ціна: " + price + ", Кімната: " + roomNumber);
    }

    @Override
    public double calculateCost() {
        return price;
    }
}
