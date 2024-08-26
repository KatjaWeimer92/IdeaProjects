package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample5 {
    public static void main(String[] args) {
        /*
    Написать программу, которая сравнивает две коллекции Set (множество, набор)
    и выводит на экран:
    - элементы, которые присутствуют ТОЛЬКО в первой коллекции;
    - элементы, которые присутствуют ТОЛЬКО во второй коллекции;
    - элементы, которые присутствуют в обеих коллекциях;
     */

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        Set<Integer> set2 = new HashSet<>(Arrays.asList(4,5,6,7,8));

        Set<Integer> onlyInSet1 = new HashSet<>(set1);
        onlyInSet1.removeAll(set2);

        Set<Integer> onlyInSet2 = new HashSet<>(set2);
        onlyInSet2.removeAll(set1);

        Set<Integer> inBothSets = new HashSet<>(set1);
        inBothSets.retainAll(set2);

        System.out.println("Элементы с первой коллекции: " + onlyInSet1);
        System.out.println("Элементы со второй коллекции: " + onlyInSet2);
        System.out.println("Элементы с обеих коллекций: " + inBothSets);

    }
}
