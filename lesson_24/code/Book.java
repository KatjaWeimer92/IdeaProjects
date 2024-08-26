public class Book extends PrintMedia{

    private String author;
    private int numberPages;

    public Book(String title, int id, int year, boolean isAvailable, String author, int numberPages) {
        super(title, id, year, isAvailable);
        this.author = author;
        this.numberPages = numberPages;
    }


    public String getAuthor() {
        return author;
    }

    public int getNumberPages() {
        return numberPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", numberPages=" + numberPages +
                '}';
    }
}
