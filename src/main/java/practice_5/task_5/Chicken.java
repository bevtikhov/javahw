package practice_5.task_5;

public class Chicken extends FarmAnimal{
    @Override
    public void produce() {
        System.out.println("Яйца собраны");

    }

    @Override
    public void need() {
        System.out.println("Курице насыпано зерно");
    }
}
