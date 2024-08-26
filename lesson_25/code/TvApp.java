import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TvApp {
    public static void main(String[] args) {

        List<Tv> tvs = new ArrayList<>();

        tvs.add(new Tv("LG", 65));
        tvs.add(new Tv("Samsung", 30));
        tvs.add(new Tv("Philips", 55));

        System.out.println("Коллекция: ");
        for (Tv tv : tvs){
            System.out.println(tv);
        }

        String manufacturerToRemove = tvs.get(1).getManufacturer();
        Iterator<Tv> iterator = tvs.iterator();
        while (iterator.hasNext()){
            Tv tv = iterator.next();
            if (tv.getManufacturer().equals(manufacturerToRemove)){
                iterator.remove();
                break;
            }
        }
        System.out.println("Новая коллекция: ");
        for (Tv tv: tvs){
            System.out.println(tv);
        }
    }
}
