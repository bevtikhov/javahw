package practice_5.task_1;

public class Zoo {
    Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
        System.out.println("Животное " + animal + " добавлено в зоопарк");
    }
    public void showAnimalBehavior(){
        animal.move();
        animal.makeSound();
    }
    public void removeAnimal(){
        System.out.println("Животное " + animal + " выпущено из зоопарка");
        this.animal = null;
    }
}
