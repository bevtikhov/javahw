package practice_5.task_4;

public class Shark extends SeaCreature{
    public Shark(String speed) {
        super(speed);
    }

    @Override
    public void move() {
        System.out.println("Акула " + speed + " и агрессивно плавает");
    }
}
