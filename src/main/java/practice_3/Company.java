package practice_3;

//Создайте класс Company с полями:
//static String companyName — общее название для всех сотрудников
//final int employeeID — уникальный идентификатор (нельзя менять)
//String employeeName — имя сотрудника Реализуйте конструктор, принимающий employeeID и
// employeeName, статический метод printCompanyName(), геттеры и сеттеры для employeeName.
// В main: создайте несколько сотрудников, измените companyName и проверьте, что она изменилась для всех.
// Попробуйте изменить employeeID — должно быть невозможно.


public class Company {
    static String companyName = "yandex";
    final int employeeID;
    String employeeName;

    Company(int someEmployeeID, String someEmployeeName) {
        this.employeeID = someEmployeeID;
        this.employeeName = someEmployeeName;
    }

    static void printCompanyName() {
        System.out.println("Название компании: " + companyName);
    }

    String getEmployeeName() {
        return this.employeeName;
    }

    void setEmployeeName(String EmployeeName) {
        this.employeeName = EmployeeName;
    }

    static void main(String[] args) {
        Company employee1 = new Company(1, "Николай");
        Company employee2 = new Company(2, "Алексей");
        printCompanyName();
        System.out.println(employee1.getEmployeeName() + " работает в " + Company.companyName);
        System.out.println(employee2.getEmployeeName() + " работает в " + Company.companyName);
        companyName = "Ozon";
        printCompanyName();
        System.out.println(employee1.getEmployeeName() + " работает в " + Company.companyName);
        System.out.println(employee2.getEmployeeName() + " работает в " + Company.companyName);
        // employee1.employeeID = 5; // ошибка: java: cannot assign a value to final variable employeeID
    }
}