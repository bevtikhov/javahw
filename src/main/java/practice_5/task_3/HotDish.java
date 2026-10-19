package practice_5.task_3;

public class HotDish extends Dish {
    private int temperature; //гр по Цельсию
    HotDish(int temperature){
        this.temperature = temperature;
    }

    @Override
    public void getDescription() {
        System.out.println("Горячее блюдо с температурой " + temperature + " °C");
    }
}
