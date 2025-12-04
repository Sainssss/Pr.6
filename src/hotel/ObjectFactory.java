package hotel;

public class ObjectFactory {
    public static Guest createGuest(String name, String phone, String email) {
        return new Guest(name, phone, email);
    }

    public static CashPayment createCashPayment(String guestName, double amount) {
        return new CashPayment(guestName, amount);
    }

    public static CardPayment createCardPayment(String guestName, double amount, String cardType) {
        return new CardPayment(guestName, amount, cardType);
    }

    public static MealService createMealService(String name, double price) {
        return new MealService(name, price);
    }

    public static RoomService createRoomService(String name, double price, int roomNumber) {
        return new RoomService(name, price, roomNumber);
    }
}
