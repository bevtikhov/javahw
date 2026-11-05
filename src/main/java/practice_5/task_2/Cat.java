package practice_5.task_2;

public class Cat extends Pet{
    @Override
    public void eat() {
        System.out.println("Ест влажный корм");
    }
    @Override
    public void interact() {
        System.out.println("Играет");
    }
}
