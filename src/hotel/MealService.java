package hotel;

public class MealService extends Service {

    public MealService(String name, double price) {
        super(name, price);
    }

    @Override
    public void use() {
        System.out.println("Замовлено харчування: " + name);
    }

    @Override
    public void getServiceInfo() {
        System.out.println("MealService: " + name + ", Ціна: " + price);
    }

    @Override
    public double calculateCost() {
        return price;
    }
}
