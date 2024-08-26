import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        printTableForNumber();
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
}
