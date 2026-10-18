package practice_2;

//Создайте класс Laptop с полями brand и price.
// Реализуйте конструктор, геттеры и сеттеры, и
// метод printInfo(), выводящий информацию о ноутбуке и его цене.
// В main измените цену и выведите информацию.

public class Laptop {
    String brand;
    double price;
    Laptop(String someBrand, double somePrice){
        this.brand = someBrand;
        this.price = somePrice;
    }
    String getBrand(){
        return this.brand;
    }
    double getPrice(){
        return this.price;
    }
    public void setBrand(String newBrand){
        this.brand = newBrand;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    public void printInfo(){
        System.out.println("Бренд ноутбука: " + brand);
        System.out.println("Цена ноутбука: " + price);
    }
    public static void main (String[] args){
        Laptop macbook = new Laptop("apple", 1000.0);
        macbook.setPrice(1500.0);
        macbook.printInfo();
    }
}
