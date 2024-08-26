public class Main {
    // Arrays in Java Массивы в джаве

    /*
    Массив - это набор однотипных элементов
    type[] array-name = new type [size]
     */

    public static void main(String[] args) {


        //int[] sample = new int[10];
        int[] sample;
        sample = new int[10];

    //индексы 0 1 2 3 4 5 6 7 8 9
           //40
     /*
     sample[0] обращение к массиву через индекс
     sample[9]
     индекс последнего элемента массива всегда на единицу меньше количества элементов массива
     size = 10
     sample [size - 1]

     //Присвоение элементам значений

      */

        sample[0] = 40;
        System.out.println("Zero elt of sample array is " + sample[0]);

        sample[1] = 50;
        sample[2] = 60;
        sample[3] = 70;
        System.out.println("Second elt of sample array is " + sample[2]);

        // второй способ объявить массив и присвоит згачения элементам

        int[] numbers = new int[]{10,56,4,90};
        System.out.println(numbers[0]);

        // третий способ создания массива
        System.out.println("Print nums");
        int[] nums = {30,60,6,99};
        System.out.println(nums[2]);
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[3]);
        nums[2] = 10;
        System.out.println("nums[2] now is " + nums[2]);

        //length - размер массива

        System.out.println("nums[] length is " + nums.length);

        System.out.println("array nums in cycle");
        //вывести массив nums на печать в цикле

        for (int i = 0; i < numbers.length; i++){
            System.out.println("nums[" + i + "] = " + nums[i]);
        }

        /*
        Создадим массив из 10 элементов ;целых чисел, заполним его  значениями и выведим
        на печать в цикле
         */

        System.out.println("Ints array");

        //1. объявляем массив из 10 элементов целого типа
        int[] ints = new int[10];

        // 2. присваем значение элементом
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i + 10;
        }

            // выводим значение на печать
            for (int i = 0; i < ints.length; i++){
                System.out.println("ints[" + i + "] = " + ints[i]);

            }
        System.out.println("Names array");
            String[] names = {"John", "Mary", "Ann", "Peter"};
            for (int i = 0; i < names.length; i++){
                System.out.println("names[" + i + "] = " + names[i]);
            }

            names[1] = "Kate";
        System.out.println("With Kate");
        for (int i = 0; i < names.length; i++){
            System.out.println("names[" + i + "] = " + names[i]);
        }

        names[names.length - 1] = "Tom"; //последний элемент
        names[names.length - 2] = "Jack";
        System.out.println("With Tom and Jack");
        for (int i = 0; i < names.length; i++){
            System.out.println("names[" + i + "] = " + names[i]);
        }

        // добавить еще два имени в массив

        //  создать массив на 2 элемента больше старого

        String[] newNames = new String[names.length + 2];

        // копируем элименты из старого в новый

        for (int i = 0; i < names.length; i++){
            newNames[i] = names[i];
        }
        System.out.println("New names");
        for (int i = 0; i < newNames.length; i++) {
            System.out.println("names[" + i + "] = " + newNames[i]);
        }

        newNames[newNames.length - 1] = "Ben";
        newNames[newNames.length - 2] = "Jim";

        System.out.println("newNames");
        for (int i = 0; i < newNames.length; i++){
            System.out.println("newNames[" + i + "] = " + newNames[i]);
        }

        /*
        Написать метод, выводящий на печать максимальный элемент массива целых чисел
         */
        System.out.println("print Max");
        int[] array = {4,10,2,50,7};
        findMax(array);

        /*
        for-each loop
        for (type var: array)
        {
        statements;
        }
         */
    }

    public static void findMax(int[] arr){

        int max = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){   // 50 >10
                max = arr[i];  //max = 10
            }
        }
        System.out.println(max);
    }


}