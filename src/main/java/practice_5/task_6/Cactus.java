package practice_5.task_6;

public class Cactus extends Plant{
    public Cactus(String light, String humidity) {
        super(light, humidity);
    }

    @Override
    public void need() {
        System.out.println("Уровень влажности " + humidity);
        System.out.println("Уровень освещенности " + light);
    }
}
