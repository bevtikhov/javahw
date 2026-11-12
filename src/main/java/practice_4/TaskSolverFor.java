package practice_4;
import java.util.Scanner;

public class TaskSolverFor {
    Scanner scanner = new Scanner(System.in);

    String numbers(){
        String result = "";
        for (int number = 1; number <= 100; number++){
            if (number % 3 == 0){
                result = result + number + "\n";
            }
        }
        return result;
    }

    int sumAllNumbers(){
        int n = scanner.nextInt();
        int sum = 0;
        for (int number = 1; number <= n; number++){
            sum = sum + number;
        }
        return sum;
    }

    void multiplyTable(){
        int number = scanner.nextInt();
        for (int x = 1; x <= 10; x++){
            System.out.println(number + " x " + x + " = " + number*x);
        }
    }

    boolean checkIsPrime(){
        int number = scanner.nextInt();
        boolean isPrime = true;
        if (number < 2){
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++){
                if (number % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        return  isPrime;
    }

    String numbersOneToTen(){
        String result = "";
        for (int number = 1; number <= 10; number++){
                result = result + number + "\n";
        }
        return result;
    }



}
