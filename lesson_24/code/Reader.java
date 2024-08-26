public class Reader {
    private int idReader;
    private String nameReader;

    public Reader(int idReader, String nameReader) {
        this.idReader = idReader;
        this.nameReader = nameReader;
    }

    public int getIdReader() {
        return idReader;
    }

    public String getNameReader() {
        return nameReader;
    }

    public void setNameReader(String nameReader) {
        this.nameReader = nameReader;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "idReader=" + idReader +
                ", nameReader='" + nameReader + '\'' +
                '}';
    }
}
