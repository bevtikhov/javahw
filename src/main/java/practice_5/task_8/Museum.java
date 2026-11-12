package practice_5.task_8;

public class Museum {
    Exhibit exhibit;

    public void setExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
        System.out.println("Экспонат " + exhibit + " добавлен в музей");
    }
    public void showExhibit(){
        exhibit.describe();
    }
    public void serviceExhibit(){
        exhibit.conservation();
    }
    public void removeExhibit(){
        System.out.println("Экспонат " + exhibit + " убран на склад");
        this.exhibit = null;
    }
}
