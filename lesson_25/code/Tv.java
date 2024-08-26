public class Tv {
    private String manufacturer;
    private int size;

    public Tv(String manufacturer, int size) {
        this.manufacturer = manufacturer;
        this.size = size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "manufacturer='" + manufacturer + '\'' +
                ", size=" + size +
                '}';
    }
}
