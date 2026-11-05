package practice_5.task_4;

public class Aquarium {
    SeaCreature seaCreature;

    public void setSeaCreature(SeaCreature seaCreature) {
        this.seaCreature = seaCreature;
        System.out.println("Морское существо " + seaCreature + " добавлено в аквариум");
    }
    public void showMovement(){
        seaCreature.move();
    }
    public void removeSeaCreature(){
        System.out.println("Морское существо " + seaCreature + " выпущено из аквариума");
        this.seaCreature = null;
    }
}
