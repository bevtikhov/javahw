package practice_5.task_5;

public class Cow extends FarmAnimal{
    @Override
    public void produce() {
        System.out.println("Молоко собрано");
    }

    @Override
    public void need() {
        System.out.println("Корова пасётся");

    }
}
