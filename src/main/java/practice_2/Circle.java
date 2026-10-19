package practice_2;

//Создайте класс Circle с полем radius. Реализуйте конструктор, геттер и сеттер,
// методы calculateArea() и calculateCircumference(). В main измените радиус,
// выведите площадь и длину окружности.
//PI*r*r

public class Circle {
    double radius;
    Circle (double someRadius){
        this.radius = someRadius;
    }
    double getRadius(){
        return this.radius;
    }
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double circleCircumference() {
        return (2 * Math.PI * radius);
    }
    public void printInfo(){
        System.out.println("Площадь круга:" + calculateArea());
        System.out.println("Длина окружности:" + circleCircumference());
    }
    public static void main (String[] args){
        Circle circle1 = new Circle(5.5);
        circle1.printInfo();
        circle1.setRadius(1.0);
        circle1.printInfo();
    }
}
