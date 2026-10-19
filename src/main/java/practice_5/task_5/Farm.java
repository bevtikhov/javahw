package practice_5.task_5;

public class Farm {
    FarmAnimal farmAnimal;

    public void setFarmAnimal(FarmAnimal farmAnimal) {
        this.farmAnimal = farmAnimal;
        System.out.println("Животное " + farmAnimal + " добавлено на ферму");
    }
    public void removeFarmAnimal(){
        System.out.println("Животное " + farmAnimal + " выпущено с фермы");
        this.farmAnimal = null;
    }
    public void serviceAnimal(){
        farmAnimal.produce();
        farmAnimal.need();
    }
}
