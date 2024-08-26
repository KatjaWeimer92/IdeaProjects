public class LibraryCatalog {

    private MediaItem[] items;
    private int count;
    public LibraryCatalog(int size) {
        items = new MediaItem[size];
        count = 0;
    }
    public void addItem(MediaItem item) {
        if (count < items.length) {
            items[count] = item;
            count++;
        } else {
            System.out.println("Библиотека заполнена. Невозможно добавить новый элемент.");
        }
    }
    public void displayCatalog() {
        System.out.println("Библиотечный каталог:");
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

}
