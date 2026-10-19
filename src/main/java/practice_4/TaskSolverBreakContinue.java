package practice_4;
import java.util.Scanner;

public class TaskSolverBreakContinue {
    Scanner scanner = new Scanner(System.in);

    int sumUntilNegative() {
        int sum = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum = sum + number;
        }
        return sum;
    }

    String skipNumbers() {
        String result = "";

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            result = result + i + " ";
        }
        return result;
    }

    String positiveNum(){
        String result = "";
        int number = scanner.nextInt();

        while (number != 0){
            if (number < 0){
                number = scanner.nextInt();
                continue;
            }
            result = result + number + " ";
            number = scanner.nextInt();
        }
        return result;
    }

    String stopCommand(){
        while (true){
            System.out.println("Введите команду");
            String text = scanner.nextLine();
            if (text.equals("stop")){
                break;
            }
        }
        return "Программа завершена";
    }









}

