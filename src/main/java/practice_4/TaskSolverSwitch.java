package practice_4;
import java.util.Scanner;

public class TaskSolverSwitch {
    Scanner scanner = new Scanner(System.in);

    public String dayWeek(){
        int day = scanner.nextInt();
        String result;
        switch (day){
            case 1:
                result = "Понедельник";
                break;
            case 2:
                result = "Вторник";
                break;
            case 3:
                result = "Среда";
                break;
            case 4:
                result = "Четверг";
                break;
            case 5:
                result = "Пятница";
                break;
            case 6:
                result = "Суббота";
                break;
            case 7:
                result = "Воскресенье";
                break;
            default:
                result = "Введите число от 1 до 7";
                break;
        }
        return result;
    }

    public String costTicket() {
        int day = scanner.nextInt();
        String result;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                result = "300 рублей";
                break;
            case 6:
            case 7:
                result = "450 рублей";
                break;
            default:
                result = "Введите число от 1 до 7";
                break;
        }
        return result;
    }

    public String convertGrade(){
        int grade = scanner.nextInt();
        if (grade < 0 || grade > 100) {
            return "Балл должен быть от 0 до 100";
        }

        String result;
        switch (grade / 10){
            case 10:
            case 9:
                result = "A";
                break;
            case 8:
                result = "B";
                break;
            case 7:
                result = "C";
                break;
            case 6:
                result = "D";
                break;
            default:
                result = "F";
                break;
        }
        return result;
    }

    public String textCommand(){
        String command = scanner.nextLine();
        String result;
        switch (command){
            case "start":
                result = "Система запущена";
                break;
            case "stop":
                result = "Система остановлена";
                break;
            case "restart":
                result = "Система перезапущена";
                break;
            case "status":
                result = "Система активна";
                break;
            default:
                result = "Неизвестная команда";
                break;

        }
        return result;
    }

    String calculate(){
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        scanner.nextLine();
        String operator = scanner.nextLine();
        String result;
        switch (operator){
            case "+":
                result = "Результат: " + (num1 + num2);
                break;
            case "-":
                result = "Результат: " + (num1 - num2);
                break;
            case "*":
                result = "Результат: " + (num1 * num2);
                break;
            case "/":
                if (num2 == 0){
                    result = "На ноль делить нельзя";
                } else
                result = "Результат: " + (num1 / num2);
                break;
            default:
                result = "неизвестный оператор";
                break;
        }
        return result;
    }



}
