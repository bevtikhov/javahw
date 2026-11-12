package practice_5.task_3;

public class Main {
    static void main(String[] args) {
        Menu menu = new Menu();
        HotDish soup = new HotDish(90);
        Drink beer = new Drink(500);
        menu.setDish(soup);
        menu.printMenu();
        menu.removeDish();
        menu.setDish(beer);
        menu.printMenu();
        menu.removeDish();

    }
}
