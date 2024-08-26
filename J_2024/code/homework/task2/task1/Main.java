package homework.task2.task1;

public class Main {
    public static void main(String[] args) {

        int x = 25;
        int y = 12;

        int sum = x +y;
        int multiplication = x * y;
        int division = x / y;
        int subtraction = x - y;
        int remainderOfDivision = x % y;


        System.out.println("Сумма x + y = " + sum);
        System.out.println("Умножение x * y = " + multiplication);
        System.out.println("Деление x / y = " + division);
        System.out.println("Вычитание x - y = " + subtraction);
        System.out.println("Остаток от деления = " + remainderOfDivision);

        if (x % 2 == 0){
            System.out.println("x четное");
        }
        else {
            System.out.println("x нечетное");
        }

        if (y % 2 == 0){
            System.out.println("y четное");
        }
        else {
            System.out.println("y нечетное");
        }
    }
}
