package hotel;

public class RoomService extends Service {
    int roomNumber;
    public RoomService(String n, double p, int rNum) { super(n, p); roomNumber = rNum; }
    @Override
    public void use() { System.out.println("Послуга для кімнати " + roomNumber + ": " + name); }
}
