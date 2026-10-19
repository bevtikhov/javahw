package practice_5.task_6;

public abstract class Plant {
    String light;
    String humidity;

    public Plant(String light, String humidity) {
        this.light = light;
        this.humidity = humidity;
    }

    public abstract void need();
}
