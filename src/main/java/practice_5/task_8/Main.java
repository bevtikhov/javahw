package practice_5.task_8;

public class Main {
    static void main(String[] args) {
        Museum museum = new Museum();
        Manuscript manuscript = new Manuscript();
        Sculpture sculpture = new Sculpture();
        museum.setExhibit(manuscript);
        museum.serviceExhibit();
        museum.showExhibit();
        museum.removeExhibit();
        museum.setExhibit(sculpture);
        museum.showExhibit();
        museum.serviceExhibit();
        museum.removeExhibit();
    }
}
