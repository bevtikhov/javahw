package practice_5.task_6;

public class Main {
    static void main(String[] args) {
        Garden garden = new Garden();
        Orchid orchid = new Orchid("низкий", "высокий");
        Cactus cactus = new Cactus("высокий", "нулевой");
        garden.setPlant(orchid);
        garden.maintainPlant();
        garden.removePlant();
        garden.setPlant(cactus);
        garden.maintainPlant();
        garden.removePlant();
    }
}
