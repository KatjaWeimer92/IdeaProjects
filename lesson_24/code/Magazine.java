public class Magazine extends PrintMedia{

    private int issue;

    public Magazine(String title, int id, int year, boolean isAvailable, int issue) {
        super(title, id, year, isAvailable);
        this.issue = issue;
    }

    public int getIssue() {
        return issue;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issue=" + issue +
                '}';
    }
}
