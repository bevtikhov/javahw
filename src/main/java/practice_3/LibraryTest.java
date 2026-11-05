package practice_3;

public class LibraryTest {
    static void main (String[] args){
        Library library = new Library();
        library.category = "Детектив";
        System.out.println("Категория: " + library.category);
        library.year = 2012;
        System.out.println("Год: " + library.year);
        library.author = "Джек Лондон";
        System.out.println("Автор: " + library.author);
        //library.bookTitle = "Шерлок Холмс"; //ошибка bookTitle has private access in practice_3.Library
        //System.out.println("Название: " + library.bookTitle); // ошибка bookTitle has private access in practice_3.Library
    }

}
