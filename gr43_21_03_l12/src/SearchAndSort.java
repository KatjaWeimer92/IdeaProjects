import java.util.Arrays;

public class SearchAndSort {

    public static void main(String[] args) {
        int[] array = {4,5,0,12,14};
        System.out.println("index of the element is " + linearSearch(array, 12)); //3
        System.out.println("index of the element is " + linearSearch(array, 56)); //-1

        int[] arrToSort = {7,4,0,5,-2,69,98,50};
        bubbleSort(arrToSort);

        for (int elt : arrToSort) {
            System.out.print(elt + " ");
        }
        //System.out.println();
        //System.out.println("just print array");
        //System.out.println(array);

        System.out.println("Array to String");

        System.out.println(Arrays.toString(arrToSort));

        System.out.println("sort with Arrays.sort");
        int[] ints = {9,1,0,-456,678,8};
        System.out.println("before sort");
        System.out.println(Arrays.toString(ints));
        Arrays.sort(ints);
        System.out.println("after sort");
        System.out.println(Arrays.toString(ints));
    }

    /*
    Сортировка пузырьком
    Алгоритм проходит по массиву и сравнивает каждую пару соседних элементов. Когда
    встречается пара, расположенная по порядку, он меняет эти два элимета местами

    6 3 0 5

    Первый проход
    6 3 0 5 -> 3 6 0 5 -> 3 0 6 5 -> 3 0 5 6

    Второй проход

    3 0 5 6 -> 0 3 5 6

    Третий проход

    0 3 5 6
    a = 1
    b = 2
    a =b = 2
    b = a= 2

    temp = a = 1
    a = b = 2
    b = temp = 1
     */
// 6 3 0 5 -> 3 6 0 5 -> 3 0 6 5 -> 3 0 5 6
    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;


        while (!sorted) {
            sorted = true;

        for (int i = 0; i < array.length - 1; i++) {  //1

            if (array[i] > array[i + 1]) {// проверка необходимости перестановки соседних элементов
                temp = array[i];  //6
                array[i] = array[i + 1]; //3
                array[i + 1] = temp; //6
                sorted = false;
            }
        }
    }
}

    /*
    Пусть есть массив целых чисел, нужно написать метод , находящий и возвращающий индекс
    заданного элемента. Если такого элемента нет, то метод должен вернуть -1
     1,2,3     3
     */

    public static int linearSearch(int[] array, int n){
        if (array.length == 0){ //проверка на отсутствие элементов в массиве
            return -1;
        }
        for (int index = 0; index < array.length; index++){
            if (array[index] == n){
                return index;
            }

        }
        return -1;
    }
}
