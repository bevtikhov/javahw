package practice_5.task_6;

public class Garden {
    Plant plant;

    public void setPlant(Plant plant) {
        this.plant = plant;
        System.out.println("Растение " + plant + " добавлено в сад");
    }
    public void maintainPlant(){
        plant.need();
    }
    public void removePlant(){
        System.out.println("Растение " + plant + " убрано из сада");
        this.plant = null;
    }
}
