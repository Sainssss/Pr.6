package hotel;

public class ObjectFactory {
    public static Guest createGuest(String n, String ph, String email) {
        Guest g = new Guest(n, ph, email);
        DataStorage.addGuest(g);
        return g;
    }

    public static Room createRoom(int num, String type, double price) {
        Room r = new Room(num, type, price);
        DataStorage.addRoom(r);
        return r;
    }

    public static Booking createBooking(String sd, String ed, String gName, int rNum) {
        Booking b = new Booking(sd, ed, gName, rNum);
        DataStorage.addBooking(b);
        return b;
    }
}
