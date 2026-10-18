package practice_5.task_2;

public class Main {
    static void main(String[] args) {
        PetManager petManager = new PetManager();
        Dog dog = new Dog();
        Cat cat = new Cat();
        petManager.setPet(dog);
        petManager.handlePet();
        petManager.removePet();
        petManager.setPet(cat);
        petManager.handlePet();
        petManager.removePet();


    }
}
