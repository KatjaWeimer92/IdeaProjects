public class Main {

    /*
-Cоздать массив строк fruits (фрукты) из 4 элементов: Orange,Apple,Banana,Mango.
-Вывести созданный массив на экран используя цикл for.
-Заменить в созданном массиве значение первого элемента на Kiwi (т.е. присвоить первому элементу значение Kiwi)
-Вывести измененный массив на экран используя цикл for.
Задание можно выполнить непосредственно в методе main, не создавая отдельный метод.
     */
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
        System.out.println("print even elements");
        for (int i = 0; i < fruits.length; i++){
            if (i % 2 == 0){
                System.out.println(fruits[i]);
            }
        }

        System.out.println("Print min");
        int[] array = {35,9,56,7};
        findMin(array);
    }

    /*
    Дан массив целых чисел. Написать метод, возвращающий наименьший элемент массива.
public static int findMin(int[] ints)
     */

    public static int findMin(int[] ints) {

        int min = ints[0];

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];


            }
        }
        System.out.println(min);
        return min;
    }
 }

