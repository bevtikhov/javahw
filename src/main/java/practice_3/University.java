package practice_3;

//Создайте класс University с полями:
//static String universityName — общее имя университета
//final int studentID — уникальный ID
//String studentName Реализуйте конструктор для studentID и studentName,
// статический метод changeUniversityName(String newName), геттер для studentName,
// метод printStudentInfo() — выводит имя, ID и университет.
// В main: создайте 3 студента, измените название университета и выведите данные.


public class University {
    static String universityName;
    final int studentID;
    String studentName;

    University(int someStudentID, String someStudentName){
        this.studentID = someStudentID;
        this.studentName = someStudentName;
    }
    static void changeUniversityName(String newName){
        University.universityName = newName;
    }
    String getStudentName(){
        return this.studentName;
    }
    void printStudentInfo(){
        System.out.println("Имя студента: " + studentName + " ID студента: " + studentID + " Университет: " + University.universityName);
    }
    static void main (String[] args){
        University petya = new University(1, "Петя");
        University vasya = new University(2, "Вася");
        University kolya = new University(3, "Коля");
        petya.printStudentInfo();
        vasya.printStudentInfo();
        kolya.printStudentInfo();
        changeUniversityName("МГУ");
        petya.printStudentInfo();
        vasya.printStudentInfo();
        kolya.printStudentInfo();
    }


}
