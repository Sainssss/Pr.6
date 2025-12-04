package hotel;

public class Main {
    public static void main(String[] args) {
        Guest guest = ObjectFactory.createGuest("Іван Іванов", "0991234567", "ivan@email.com");
        Room room = ObjectFactory.createRoom(101, "Стандарт", 1200);
        Booking booking = ObjectFactory.createBooking("01.12.2025", "05.12.2025", guest.name, room.number);

        guest.showInfo();
        room.showInfo();
        System.out.println(booking);

        Payment pay1 = new CashPayment(guest.name, 500);
        pay1.process();
        Payment pay2 = new CardPayment(guest.name, 700, "Visa");
        pay2.process();

        Service cleaning = new Service("Прибирання", 100);
        cleaning.use();

        MealService dinner = new MealService("Вечеря", 250);
        dinner.use();

        RoomService minibar = new RoomService("Мінібар", 200, room.number);
        minibar.use();
    }
}
