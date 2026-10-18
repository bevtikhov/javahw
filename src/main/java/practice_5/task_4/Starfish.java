package practice_5.task_4;

public class Starfish extends SeaCreature{
    public Starfish(String speed) {
        super(speed);
    }

    @Override
    public void move() {
        System.out.println("Морская звезда " + speed + " ползает по дну");
    }
}
