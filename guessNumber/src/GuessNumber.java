import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 5;

        System.out.println("Guess a number between 0 and 9");
        int answer = scanner.nextInt();

        if (answer == secretNumber){
            System.out.println("You are right! You have guessed the secret number!");
        } else {
           // System.out.println("Sorry, you are wrong. Try again later");
            System.out.print("Sorry, the number ");

            // вложенный if
            if(answer < secretNumber){
                System.out.println("is too small");
                }
            else{
                System.out.println("is too big");
            }

        }

    }


}
