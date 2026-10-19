package practice_5.task_2;

public class Dog extends Pet{

    @Override
    public void eat() {
        System.out.println("Ест сухой корм");
    }

    @Override
    public void interact() {
        System.out.println("Гуляет");
    }
}
