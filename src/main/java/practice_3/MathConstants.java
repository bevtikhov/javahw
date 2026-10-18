package practice_3;

//Создайте класс MathConstants с полями:
//final double PI = 3.14159
//final double E = 2.71828
//Реализуйте статические методы calculateCircleArea(double r) — площадь круга и calculateCircumference(double r) — длина окружности. В main: вызовите методы с разными значениями радиуса.
//calculateExponentialGrowth(double initialValue, double rate, double time) — расчет по формуле экспоненциального роста:


class MathConstants {
    static final double PI = 3.14159;
    static final double E = 2.71828;

    static double calculateCircleArea(double r){
        return PI * r * r;
    }
    static double calculateCircumference(double r){
        return 2* PI * r;
    }
    static double calculateExponentialGrowth(double initialValue, double rate, double time){
        return initialValue * Math.pow(E, rate * time);
    }
    static void main (String[] args){
        System.out.println("Площадь круга с радиусом 5 равна: " + calculateCircleArea(5));
        System.out.println("Площадь круга с радиусом 10 равна: " + calculateCircleArea(10));
        System.out.println("Длина окружности с радиусом 15 равна: " + calculateCircumference(15));
        System.out.println("Длина окружности с радиусом 20 равна: " + calculateCircumference(20));
        System.out.println(calculateExponentialGrowth(5, 2,3));

    }

}

