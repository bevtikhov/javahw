package practice_4;
import java.util.Scanner;

public class TaskSolverWhileDoWhile {
    Scanner scanner = new Scanner(System.in);

    int factorial(){
        int n = scanner.nextInt();
        int result = 1;
        int i = 1;
        while (i <= n){
            result = result * i;
            i++;
        }
        return result;
    }

    String printParity(){
        int n = scanner.nextInt();
        String result = "";
        int i = 1;
        while (i <= n){
            if (i % 2 ==0){
                result = result + i + " ";
            }
            i++;
        }
        return result;
    }

    String count(){
        int n = scanner.nextInt();
        String result = "";
        while (n >= 1){
            result = result + n + " ";
            n--;
        }
        return result;
    }

    String positiveNum(){
        int number;
        do {
            System.out.println("Введите число");
            number = scanner.nextInt();
        } while (number <=0 );
        return "Число положительное";
    }

    String checkPassword(){
        String correctPassword = "qwerty";
        String password;
        do {
            System.out.println("Введите пароль");
            password = scanner.nextLine();
        } while (!password.equals(correctPassword));
        return "Пароль верный";
    }

    String numbersOneToTen2(){
        String result = "";
        int i = 1;
        do {
            result = result + i + " ";
            i++;
        } while (i <= 10);
        return result;
    }

    String commandExit(){
        String commandExit = "exit";
        String command;
        do {
            System.out.println("Введите команду для выхода");
            command = scanner.nextLine();
        } while (!command.equals(commandExit));
        return "Программа завершена";
    }

    int countNums(){
        int number= scanner.nextInt();
        int count = 0;
        do {
            number = number / 10;
            count++;
        } while (number != 0);
        return count;
    }





}
