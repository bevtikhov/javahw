package practice_5.task_7;

public class Main {
    static void main(String[] args) {
        Park park = new Park();
        RollerCoaster rollerCoaster = new RollerCoaster();
        Carousel carousel = new Carousel();
        park.setAttraction(rollerCoaster);
        park.operateAttraction();
        park.removeAttraction();
        park.setAttraction(carousel);
        park.operateAttraction();
        park.removeAttraction();
    }
}
