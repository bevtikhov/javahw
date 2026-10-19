package practice_5.task_4;

public class Main {
    static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        Shark shark = new Shark("быстро");
        Starfish starfish = new Starfish("медленно");
        aquarium.setSeaCreature(shark);
        aquarium.showMovement();
        aquarium.removeSeaCreature();
        aquarium.setSeaCreature(starfish);
        aquarium.showMovement();
        aquarium.removeSeaCreature();

    }
}
