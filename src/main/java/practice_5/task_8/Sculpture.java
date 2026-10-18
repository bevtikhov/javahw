package practice_5.task_8;

public class Sculpture extends Exhibit{
    @Override
    void describe() {
        System.out.println("Древняя античная статуя");
    }

    @Override
    void conservation() {
        System.out.println("Реставрация произведена");

    }
}
