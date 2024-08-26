import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //charAtExample();
        System.out.println(factorial(5));

        System.out.println(countPower(2,3));

        System.out.println(countBanknotes(5));

    }

    //public static void charAtExample(){

        //Scanner scanner = new Scanner(System.in);

      //  char ch;

      //  do {

       //     System.out.println("Enter a letter / enter q to quit");
        //    ch= scanner.next().charAt(0);

         //   System.out.println(" you have entered " + ch);
       // }while (ch !='q');
    //}

    // 5! = 5*4*3*2*1
    /*
   Используя цикл for написать метод, который находит факториал числа n
     */

    public static int factorial(int n){
         int fact =1;
        for (int i = 1; i <= n; i++){
            //fact = fact *1;
            fact *= i;
        }
        return fact;
    }

    /*
    Написать метод, который находит заданное число в заданную степень
    НЕ использовать имеющиеся в Джава методы возведения в степень!
     */

    public static int countPower(int base, int power){
        int result = 1;

        for (int i = 1; i <= power; i++){
            result = result * base;
        }
        return result;
    }

    /*
    В банкомате есть банкноты номиналом 1, 5, 10 долларов

    Написать метод, который подсчитывает минимальное количество бакнот,
    необходимое для выдачи суммы денег №.
    Использовать можно только арифметические действия.
    47 - > 4  по 10, 1 по 5, 2 по 1

     */

    public static int countBanknotes(int n){

        int tens = n / 10;
        int fives = n % 10 /5;
        int ones = n % 5; //n % 10 % 5;  //n % 5

        return tens + fives + ones;

    }
}
