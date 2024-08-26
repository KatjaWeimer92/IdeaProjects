public class Main {

    /*Есть 2 переменные a и b
    a =1
    b =2
    С помощью оператора присваивания и сложения и вычитания поменять местами их значения

     */

    public static void main(String[] args) {
        int a = 10;
        int b = 43;

        a = a + b;
        b = a - b; // a + b - b = a
        a = a - b; // a - (a - b) = a - a + b = b

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b - (b = a); // a + b - a = b

        System.out.println("Back");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        /*
        1.Написать метод, находящий общие элименты двух массивов целых чисел и печатающий их

         */

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {2,25,28,3,8};

        findCommonElts(arr1, arr2);
        //System.out.println(findDifference(arr2));

        /*
        2. Написать метод, находящий разность между максимальным и минимальным элементами
        массивов целых чисел
        Известно, что в массиве не меньше двух элементов и все они  разные
         */

    }

    public static int findDifference(int[] numbers){
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
        }
            else if (numbers[i] < min){
            min = numbers[i];
            }
        }
        return max - min;
    }

    public static void findCommonElts(int[] arr1, int[] arr2){
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr2.length; j++){
               if (arr1[i] == arr2[j]){
                   System.out.println("common element is : " + arr1[i]);
               }
            }
        }
    }
}
