public class Practice {

    /*
    вывести на экран треугольник, состоящий из цифр от 1 до числа n
    1
    12
    123
    1234
    12345
    ...
    1234..n
     */

    public static void main(String[] args) {

        triangle(6);

    }

    public static void triangle(int n){

        for (int i = 1; i <= n; i++ ){

            for (int j = 1; j <= i; j++){

                //System.out.print(j); // тут будет 1,   12,  123 ....
                System.out.print(i);
            }
            System.out.println();
        }

        }
    }

