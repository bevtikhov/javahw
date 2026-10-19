package practice_2;

public class Car {

    String brand;
    int year;

    Car(String someBrand, int someYear) {
        this.brand = someBrand;
        this.year = someYear;
    }

    String getBrand() {
        return this.brand;
    }

    int getYear() {
        return this.year;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public void print() {
        System.out.println("Бренд: " + brand);
        System.out.println("Год: " + year);
    }
    public static void main (String[] args) {
        Car mqqueen = new Car("dodge", 1975);
        mqqueen.print();
        mqqueen.setYear(1999);
        mqqueen.print();
    }
}
