package practice_5.task_7;

public class Carousel extends Attraction{
    @Override
    public void info() {
        System.out.println("Вращающийся аттракцион для детей");
    }

    @Override
    public void maintain() {
        System.out.println("Техническое обслуживание пройдено");

    }
}
