public class Main {

    /*
    цикл For
    for ( initialisation; condition; incr/decr)
    initialisation - объявление и присвоение начаального значения перменной (счетчик).
                     Выпольняетяс один раз в начале цикла

    condition - условие, определяющее будет ли выполнятся цикл. Цикл выполняется пока условие = true

    incr/decr -  определяет изменение переменной - счетчика
     */

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++)
        {
            System.out.println(i);
        }

        System.out.println("For - ");

        for (int i = 10; i > 1; i--){

            System.out.println(i);
        }

        for(int i = 0; i < 5;){

            System.out.println(i);
            i++;
        }

        System.out.println("two variables");

        for (int i1 = 1, j1 = 10; i1 <= j1; i1++, j1--){
            System.out.println("i: " + i1 + " ,j: " + j1);
        }


        //for(; ;){} // бесконечный цикл

        int sum = 0;
        for (int j = 1; j <= 5; sum += j++ );

        System.out.println("Sum without body is " + sum);
    }

    public static int sum(int n){

        int sum = 0;

        for (int i = 1; 1 <= n; i++)
        {
            //sum = sum + i;
            sum += i;
        }
        return sum;
    }
}
