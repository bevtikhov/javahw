package practice_5.task_8;

public class Manuscript extends Exhibit{
    @Override
    void describe() {
        System.out.println("Древний рукописный текст");
    }

    @Override
    void conservation() {
        System.out.println("Необходимый уровень влажности установлен");
    }
}
