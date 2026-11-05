package practice_2;

//Создайте класс Product с полями name и price.
// Реализуйте конструктор, геттеры, сеттер для цены,
// метод applyDiscount(discount) для применения скидки,
// метод printInfo(), выводящий информацию о товаре и цене.
// В main измените цену, примените скидку и выведите цену.

public class Product {
    String name;
    double price;
    Product (String someName, double somePrice){
        this.name = someName;
        this.price = somePrice;
    }
    String getName(){
        return this.name;
    }
    double getPrice(){
        return this.price;
    }
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    public void applyDiscount(int discount){
        price = price * (1-discount / 100.0);
    }
    public void printInfo(){
        System.out.println("Товар: " + name);
        System.out.println("Цена: " + price);
    }
    public static void main (String[] args) {
        Product product = new Product("Смартфон", 10000.0);
        product.setPrice(15000.0);
        product.applyDiscount(20);
        product.printInfo();

    }
}

