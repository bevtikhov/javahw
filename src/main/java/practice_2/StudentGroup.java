package practice_2;

//Создайте класс StudentGroup с полями groupName и studentCount.
// Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(),
// выводящий информацию о группе и количестве студентов.
// В main измените число студентов и выведите информацию.

public class StudentGroup {
    String groupName;
    int studentCount;

    StudentGroup(String someGroupName, int someStudentCount) {
        this.groupName = someGroupName;
        this.studentCount = someStudentCount;
    }
    String getGroupName(){
        return this.groupName;
    }
    int getStudentCount(){
        return  this.studentCount;
    }
    public void setGroupName(String newGroupName){
        this.groupName = newGroupName;
    }
    public void setStudentCount(int newStudentCount){
        this.studentCount = newStudentCount;
    }
    public void printInfo(){
        System.out.println("Наименование группы: " + groupName);
        System.out.println("Количество студентов: " + studentCount);
    }
    public static void main(String[] args){
        StudentGroup sg = new StudentGroup("Капелька", 10);
        sg.setStudentCount(5);
        sg.printInfo();
    }
}
