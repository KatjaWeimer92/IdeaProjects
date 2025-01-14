package book.model;

public class Book {

    /*
    Создать класс Book в пакете book.model. В этом классе определить поля: private long isbn;
     private String title; private String author; private int yearOfPublishing; Создать конструкторы
     для иницализации всех полей, и конструктор для инициализации полей при отсутствии автора. Остальные
     конструкторы на Ваше усмотрение. Создать геттеры и сеттеры, исходя из логики и необходимости. Создать
     метод public void display() для печати в консоль информации о книге.

    Создать класс BookAppl в пакете ait.book с методом main. В методе main создать несколько экземпляров
    Book и вывести для каждого из них результат работы метода display.
     */

    private  long isbn;
    private String title;
    private String author;
    private int yearOfPublishing;

    public Book(long isbn, String title, String author, int yearOfPublishing) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public Book(long isbn, String title, int yearOfPublishing) {
        this.isbn = isbn;
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                '}';
    }

    public void display(){
        System.out.println("Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                '}');
    }
}
