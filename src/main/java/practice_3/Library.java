package practice_3;

//Создайте класс Library с полями:
//private String bookTitle
//protected String author
//int year (default-доступ)
//public String category Реализуйте геттеры и сеттеры для всех полей. В другом классе (например, LibraryTest) создайте объект Library и проверьте доступ к полям.


public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    String getBookTitle(){
        return bookTitle;
    }
    String getAuthor(){
        return author;
    }
    int getYear(){
        return year;
    }
    String getCategory(){
        return category;
    }
    void setBookTitle(String newBookTitle){
        this.bookTitle = newBookTitle;
    }
    void setAuthor (String newAuthor){
        this.author = newAuthor;
    }
    void setYear (int newYear){
        this.year = newYear;
    }
    void setCategory (String newtCategory){
        this.category = newtCategory;
    }
    static void main (String[] args){
        Library library = new Library();
        library.category = "Детектив";
        System.out.println("Категория: " + library.category);
        library.year = 2012;
        System.out.println("Год: " + library.year);
        library.author = "Джек Лондон";
        System.out.println("Автор: " + library.author);
        library.bookTitle = "Шерлок Холмс";
        System.out.println("Название: " + library.bookTitle);
    }
}
