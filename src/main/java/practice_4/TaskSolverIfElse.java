package practice_4;
import java.util.Scanner;

public class TaskSolverIfElse {
    Scanner scanner = new Scanner(System.in);

    public String determineSign(){
        double number = scanner.nextDouble();
        String result;
        if (number > 0){
            result = "Число положительное";
        } else if (number < 0){
            result = "Число отрицательное";
        } else {
            result = "Число равно нулю";
        }
        return result;
    }

    public double findMaximum(){
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double result;
        if (number1 > number2){
            result = number1;
        } else {
            result = number2;
        }
        return  result;
    }

    public String describeGrade(){
        int grade = scanner.nextInt();
        String result;
        if (grade == 5){
            result = "Отлично";
        } else if (grade == 4){
            result = "Хорошо";
        } else if (grade == 3){
            result = "Удовлетворительно";
        } else if (grade == 2){
            result = "Неудовлетворительно";
        } else if (grade == 1){
            result = "Неудовлетворительно";
        } else {
            result = "Введите число от 1 до 5";
        }
        return result;
    }

    public String checkParity(){
        int number = scanner.nextInt();
        String result;
        if (number % 2 == 0){
            result = "Число чётное";
        } else {
            result = "Число нечётное";
        }
        return result;
    }

    public String discount(){
        int age = scanner.nextInt();
        String result;
        if (age < 18){
            result = "Размер скидки 25%";
        } else if (age >= 65) {
            result = "Размер скидки 30%";
        } else {
            result = "Без скидки";
        }
        return result;
    }

    public String testResult(){
        int testResult = scanner.nextInt();
        if (testResult < 0 || testResult > 100) {
            return "Введите результат от 0 до 100";
        }
        String result;
        if (testResult > 89 && testResult <= 100){
            result = "Отлично";
        } else if (testResult > 74){
            result = "Хорошо";
        } else if (testResult > 59){
            result = "Удовлетворительно";
        } else if (testResult < 60 && testResult >= 0){
            result = "Неудовлетворительно";
        } else {
            result = "Введите результат от 0 до 100";
        }
        return result;
    }


}
