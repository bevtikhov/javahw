package practice_1;

public class MathOperations {

    public static int add (int x, int y){
        return x + y;
    }
    public static int subtract (int x, int y){
        return x - y;
    }
    public static int multiply (int x, int y){
        return x * y;
    }
    public static double divide (int x, int y){
        return (x/(double)y);
    }
    public static int findMax(int a, int b){
        return Math.max(a,b);
    }
    public static int difference(int x, int y){
        return Math.abs(x-y);
    }
    public static int squareArea(int side){
        return side * side;
    }
    public static int squarePerimeter(int side){
        return 4 * side;
    }
    public static double convertSecondsToMinutes(int seconds){
        return (seconds/(double)60.0);
    }
    public static double averageSpeed(double distance, double time){
        return (distance / time);
    }
    public static double findHypotenuse(double a, double b){
        return Math.sqrt(a*a + b*b);
    }
    public static double circleCircumference(double radius){
        return (2 * Math.PI * radius);
    }
    public static double calculatePercentage(double total, double part){
        return (part/total)*100;
    }
    public static double celsiusToFahrenheit(double c){
        return c * 9 / 5 + 32;
    }
    public static double fahrenheitToCelsius(double f){
        return (f - 32) * 5 / 9;
    }
    public static void main(String[] args){
        int resultAdd = MathOperations.add(1, 2);
        System.out.println("Add: " + resultAdd);

        int resultSubtract = MathOperations.subtract(3, 4);
        System.out.println("Subtract: " + resultSubtract);

        int resultMultiply = MathOperations.multiply(5, 6);
        System.out.println("Multiply: " + resultMultiply);

        double resultDivide = MathOperations.divide(7, 8);
        System.out.println("Divide: " + resultDivide);

        System.out.println("Большее число: " + findMax(9, 10));
        System.out.println("Модуль разницы: " + difference(11, 12));
        System.out.println("Площадь квадрата: " + squareArea(13));
        System.out.println("Периметр квадрата: " + squarePerimeter(14));
        System.out.println("Количество минут: " + convertSecondsToMinutes(120));
        System.out.println("Средняя скорость: " + averageSpeed(120, 2));
        System.out.println("Гипотенуза: " + findHypotenuse(15, 16));
        System.out.println("Длинна окружности: " + circleCircumference(17));
        System.out.println("Процент: " + calculatePercentage(200, 100));
        System.out.println("По Фаренгейту: " + celsiusToFahrenheit(18));
        System.out.println("По Цельсию: " + fahrenheitToCelsius(19));
    }
}
