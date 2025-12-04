package hotel;

public class Staff extends Person {
    private String position;
    private String schedule;

    public Staff(String name, String phone, String position, String schedule) {
        super(name, phone); // Конструктор Person с двумя параметрами
        this.position = position;
        this.schedule = schedule;
    }

    @Override
    public void showInfo() {
        System.out.println("Працівник: " + name + ", Посада: " + position + ", Телефон: " + phone + ", Графік: " + schedule);
    }

    @Override
    public void checkIn() {
        System.out.println(name + " почав роботу.");
    }

    @Override
    public void checkOut() {
        System.out.println(name + " закінчив роботу.");
    }

    public void changeSchedule(String newSchedule) {
        schedule = newSchedule;
        System.out.println("Новий графік для " + name + ": " + schedule);
    }
}
