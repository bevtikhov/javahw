package practice_5.task_7;

public class Park {
    Attraction attraction;

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
        System.out.println("Аттракцион " + attraction + " был добавлен в парк");
    }
    public void operateAttraction(){
        attraction.info();
        attraction.maintain();
    }
    public void removeAttraction(){
        System.out.println("Аттракцион " + attraction + " был убран из парка");
        this.attraction = null;
    }
}
