package hotel;

public class MealService extends Service {
    public MealService(String name, double price) { super(name, price); }
    @Override
    public void use() { System.out.println("Замовлено харчування: " + name); }
}
