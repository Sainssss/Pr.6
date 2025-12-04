package hotel;

public class Main {
    public static void main(String[] args) {
        // создаём гостя: name, phone, email
        Guest guest = new Guest("Ілля Лор", "0976541230", "illal@email.com");

        guest.showInfo();
        guest.checkIn();

        Payment p1 = new CashPayment(guest.name, 400);
        Payment p2 = new CardPayment(guest.name, 550, "Visa");

        p1.process();
        p2.process();

        Service meal = new MealService("Вечеря", 220);
        Service minibar = new RoomService("Мінібар", 150, 131);

        meal.use();
        minibar.use();

        guest.checkOut();
    }
}
