package Tr3;


public class Book {
    public static void main(String[] args) {
        Book firstBook = new Book("Война и Мир", "Лев Толстой", 1456);
        System.out.println(firstBook.title + ", " + firstBook.author + ", " + firstBook.pages + " стр.");
        Book secondBook = new Book("Му-му", "Иван Тургенев", 352);
        System.out.println(secondBook.title + ", " + secondBook.author + ", " + secondBook.pages + " стр.");
    }

    public String title;
    public String author;
    public int pages;

    public Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
}
