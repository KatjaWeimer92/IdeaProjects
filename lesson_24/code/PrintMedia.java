public class PrintMedia {

    private String title;
    private int id;
    private int year;
    private boolean isAvailable;

    public PrintMedia(String title, int id, int year, boolean isAvailable) {
        this.title = title;
        this.id = id;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    public PrintMedia(int newPrintMediaId, String newPrintMediaTitle, int newPrintMediaYear) {
    }

    public PrintMedia() {

    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "PrintMedia{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", year=" + year +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
