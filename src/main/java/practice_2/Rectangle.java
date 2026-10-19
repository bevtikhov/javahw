package practice_2;

//Создайте класс Rectangle с полями width и height. Реализуйте конструктор, геттеры для ширины и высоты,
// сеттер только для ширины и метод calculateArea() для расчёта площади. В main создайте прямоугольник,
// измените ширину и выведите площадь.

// нужно исправить чтобы был зачет — в `Rectangle` метод `calculateArea()` должен рассчитывать площадь по полям объекта,
// а не принимать их в качестве параметров, поскольку по условию он должен работать именно с состоянием текущего объекта.


public class Rectangle {
    int width;
    int height;

    Rectangle(int someWidth, int someHeight){
        this.width = someWidth;
        this.height = someHeight;
    }

    int getWidth(){
        return this.width;
    }

    int getHeight(){
        return this.height;
    }

    public void setWidth(int newWidth) {
        this.width = newWidth;
    }
    public int calculateArea () {
        return width * height;
    }
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(3,4);
        System.out.println(rectangle1.calculateArea());
        rectangle1.setWidth(7);
        System.out.println(rectangle1.calculateArea());

    }

}