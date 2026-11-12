package practice_5.task_5;

public class Main {
    static void main(String[] args) {
        Farm farm = new Farm();
        Cow cow = new Cow();
        Chicken chicken = new Chicken();
        farm.setFarmAnimal(cow);
        farm.serviceAnimal();
        farm.removeFarmAnimal();
        farm.setFarmAnimal(chicken);
        farm.serviceAnimal();
        farm.removeFarmAnimal();
    }
}
