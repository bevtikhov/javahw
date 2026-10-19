package practice_5.task_2;

public class PetManager {
    Pet pet;

    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("Питомец " + pet + " добавлен");
    }
    public void handlePet(){
        pet.eat();
        pet.interact();
    }
    public void removePet(){
        System.out.println("Питомец " + pet + " выпущен");
        this.pet = null;
    }
}
