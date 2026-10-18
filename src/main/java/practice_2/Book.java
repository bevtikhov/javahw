package practice_2;

// Создайте класс Book с полями title и author. Реализуйте конструктор, геттеры и сеттеры,
// и метод printInfo(), выводящий название и автора книги. В main создайте книгу, измените
// автора и выведите информацию.

public class Book {
    String title;
    String author;

    Book (String someTitle, String someAuthor) {
        this.title = someTitle;
        this.author = someAuthor;
    }
    String getTitle() {
        return this.title;
    }
    String getAuthor() {
        return this.author;
    }
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }
    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }
    public void printInfo(){
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
    }
    public static void main (String[] args) {
        Book book = new Book("100 лет одиночества", "Габриэль Гарсиа Маркес");
        book.printInfo();
        book.setAuthor("Пушкин");
        book.printInfo();
    }
}
