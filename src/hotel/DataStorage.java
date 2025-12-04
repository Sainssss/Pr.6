package hotel;

import java.util.ArrayList;
import java.util.List;

public class DataStorage {
    public static List<hotel.Guest> guests = new ArrayList<>();
    public static List<hotel.Room> rooms = new ArrayList<>();
    public static List<Booking> bookings = new ArrayList<>();

    public static void addGuest(hotel.Guest g) { guests.add(g); }
    public static void addRoom(hotel.Room r) { rooms.add(r); }
    public static void addBooking(Booking b) { bookings.add(b); }
}
