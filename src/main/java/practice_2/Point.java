package practice_2;

//Создайте класс Point с координатами x и y. Реализуйте конструктор, геттеры,
// сеттер только для x, и метод print(), выводящий координаты. В main измените x, выведите новые координаты.


public class Point {
    double x;
    double y;

    Point(double someX, double someY){
        this.x = someX;
        this.y = someY;
    }
    double getX (){
        return this.x;
    }
    double getY (){
        return this.y;
    }
    public void setX(double newX) {
        this.x = newX;
    }
    public void print(){
        System.out.println("Координата х: " + x);
        System.out.println("Координата y: " + y);
    }
    public static void main (String[] args) {
        Point newpoint = new Point(5.6, 22.1);
        newpoint.setX(8.2);
        newpoint.print();
    }
}
