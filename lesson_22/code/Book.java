public class Book extends MediaItem{
    private String genre;
    private int numberSite;

    public Book(String genre, int numberSite) {
        this.genre = genre;
        this.numberSite = numberSite;
    }

    public Book(String роман, int numberSite, String преступлениеИНаказание, String федорДостоевский, int i) {
        super();
    }

    @Override
    int id() {
        return id();
    }

    @Override
    String titel() {
        return titel();
    }

    @Override
    String author() {
        return author();
    }

    @Override
    int year() {
        return year();
    }
}
