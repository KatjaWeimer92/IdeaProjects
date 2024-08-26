package practice.tasks.task1;

import java.util.ArrayList;
import java.util.List;

public class PairDemo {
    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<>("Hi", 1);
        pair1.printPair();

        Pair<Double, String> pair2 = new Pair<>(33.24, "Hi");
        pair2.printPair();

        List<String> stringList = new ArrayList<>();
        stringList.add("22");
        stringList.add("33");
        stringList.add("44");
        stringList.add("55");
        stringList.add("66");


        Pair<List<String>, Integer> pair3 = new Pair<>(stringList, 99);
        pair3.printPair();

    }
}
