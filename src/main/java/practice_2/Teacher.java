package practice_2;


//Создайте класс Teacher с полями name и subject. Реализуйте конструктор,
// геттеры и сеттеры, и метод printInfo(), выводящий информацию о учителе и предмете.
// В main измените предмет и выведите обновлённую информацию.

public class Teacher {
    String name;
    String subject;
    Teacher(String someName, String someSubject){
        this.name = someName;
        this.subject = someSubject;
    }
    String getName(){
        return this.name;
    }
    String getSubject(){
        return this.subject;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setSubject(String newSubject){
        this.subject = newSubject;
    }
    public void printInfo(){
        System.out.println("Имя учителя: " + name);
        System.out.println("Предмет: " + subject);
    }
    public static void main(String[] args){
        Teacher teacher = new Teacher("Александр", "Литература");
        teacher.setSubject("Информатика");
        teacher.printInfo();
    }
}
