import java.util.Arrays;

public class RepositoryMedia {

    private PrintMedia[] printMedias;


    public RepositoryMedia(PrintMedia[] printMedias) {
        this.printMedias = printMedias;
    }

    public void add(PrintMedia newPrintMedia) {
        for (int i = 0; i < printMedias.length; i++) {
            if (printMedias[i] == null) {
                printMedias[i] = newPrintMedia;
                return;
            }
        }
        System.out.println("База данных переполненна!");
    }

    public PrintMedia findByName(String title){
        for (int i = 0; i < printMedias.length; i++) {
            if (printMedias[i].getTitle().equals(title)) {
                return printMedias[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "RepositoryMedia{" +
                "printMedias=" + Arrays.toString(printMedias) +
                '}';
    }
}
