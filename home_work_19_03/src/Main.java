import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
       printTableForNumber();
        System.out.println("***********");

        triangle(6);

        }

    public static void printTableForNumber(){

        Scanner scanner = new Scanner((System.in));

        int num;

        System.out.println("Enter a number");

        num = scanner.nextInt();

        System.out.println("Multiplication table of" + num);

        for (int i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }


    public static void triangle(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }

}