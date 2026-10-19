package practice_5.task_3;

public class Menu {
    Dish dish;

    public void setDish(Dish dish) {
        this.dish = dish;
        System.out.println("Позиция " + dish + " добавлена в меню");
    }
    public void printMenu(){
        dish.getDescription();
    }
    public void removeDish(){
        System.out.println("Позиция " + dish + " удалена из меню");
        this.dish = null;
    }
}
