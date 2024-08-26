public class Main {

    public static void main(String[] args) {
        String[] fruits = {"Orange", "Apple", "Banana", "Mango"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("fruits[" + i + "] = " + fruits[i]);
        }

        fruits[0] = "Kiwi";
        System.out.println("With Kiwi");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("fruits[" + i + "] = " + fruits[i]);
        }
        System.out.println("print odd elements");
        for (int i = 0; i < fruits.length; i++){
            if (i % 2 != 0){
                System.out.println(fruits[i]);
            }
        }

        /*
        Есть массив целых чисел. Написать метод, находящий и возвращающий количество
        четных чисел в этом массиве. Пример: {1, 2, 8, 7} -> количество четных чисел = 2.
         */


    }


    }

