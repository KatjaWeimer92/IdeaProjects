public class Newspaper extends PrintMedia{

    private int date;

    public Newspaper(String title, int id, int year, boolean isAvailable, int date) {
        super(title, id, year, isAvailable);
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "date=" + date +
                '}';
    }
}

