package practice_5.task_3;

public class Drink extends Dish {
    private int volume; //мл

    public Drink(int volume) {
        this.volume = volume;
    }

    @Override
    public void getDescription() {
        System.out.println("Напиток с объёмом " + volume + " мл");

    }
}
