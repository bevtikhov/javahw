package practice_3;


//Создайте класс Person с полями:
//private String firstName
//private String lastName
//private final String ssn — номер социального страхования
// Реализуйте конструктор для всех трёх полей, геттеры для всех полей,
// сеттеры только для firstName и lastName, метод printPersonInfo() — выводит: "Имя: Иван, Фамилия: Иванов,
// SSN: 123-45-6789". В main: создайте несколько объектов, измените имя у одного и выведите информацию.

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;
    Person(String someFirstName, String someLastName, String someSSN){
        this.firstName = someFirstName;
        this.lastName = someLastName;
        this.ssn = someSSN;
    }
    String getFirstName(){
        return firstName;
    }
    String getLastName(){
        return lastName;
    }
    String getSsn(){
        return ssn;
    }
    void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }
    void setLastName(String newLastName){
        this.lastName = newLastName;
    }
    void printPersonInfo(){
        System.out.println("Имя: " + firstName + " Фамилия: " + lastName + " SSN: " + ssn);
    }
    static void main (String[] args){
        Person person1 = new Person("Иван", "Петров", "289-249-129-12");
        Person person2 = new Person("Пётр", "Иванов", "389-349-139-32");
        person1.printPersonInfo();
        person2.printPersonInfo();
        person1.setFirstName("Олег");
        person1.printPersonInfo();
        person2.printPersonInfo();
    }
}
