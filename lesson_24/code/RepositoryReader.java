import java.util.Arrays;

public class RepositoryReader {

    private Reader[] readers;

    public RepositoryReader(Reader[] readers) {
        this.readers = readers;
    }

    public void add(Reader newReader) {
        for (int i = 0; i < readers.length; i++) {
            if (readers[i] == null) {
                readers[i] = newReader;
                return;
            }
        }
        System.out.println("База данных переполненна!");
    }

    public Reader findByName(String name) {
        for (int i = 0; i < readers.length; i++) {

            if (readers[i].getNameReader().equals(name)) {
                return readers[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "RepositoryReader{" +
                "readers=" + Arrays.toString(readers) +
                '}';
    }
}