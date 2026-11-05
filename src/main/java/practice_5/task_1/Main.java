package practice_5.task_1;

public class Main {
    static void main(String[] args) {
        Zoo zoo = new Zoo();
        Elephant elephant = new Elephant();
        Bird bird = new Bird();
        zoo.setAnimal(elephant);
        zoo.showAnimalBehavior();
        zoo.removeAnimal();
        zoo.setAnimal(bird);
        zoo.showAnimalBehavior();
        zoo.removeAnimal();
    }
}
