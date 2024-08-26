package task3;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static void main(String[] args) {

        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("apple", "яблоко");
        dictionary.put("book", "книга");
        dictionary.put("computer", "компьютер");
        dictionary.put("flower", "цветок");
        dictionary.put("sun", "солнце");


        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println("English: " + entry.getKey() + " - Russian: " + entry.getValue());
        }
    }
}
