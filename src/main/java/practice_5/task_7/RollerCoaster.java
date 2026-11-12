package practice_5.task_7;

public class RollerCoaster extends Attraction{
    @Override
    public void info() {
        System.out.println("Захватывающий рельсовый аттракцион с крутыми виражами");
    }

    @Override
    public void maintain() {
        System.out.println("Проверка безопасности пройдена");

    }
}
