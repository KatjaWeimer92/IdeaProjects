public class Complexity {

    public static void main(String[] args) {


    }

    /*
    Введение в анализ сложности алгоритмов

    Алгоритм это последовательность шагов, предоставляющая собой исключительно вычисление и не учитывающая особенности реализации "компьютерного железа"
    на котором она работает. Анализ сложности дает возможность
    узнать как быстро будет работать программа когда она совершает
    вычисления на разных объемах данных
     */
    // Найти максимальный элемент массива
    public static int findMaxElt(int [] ints, int n){
        int max = ints[0];

        //2 действия до запуска цикла - присвоение начального значения и проверка условия окончания цикла

        for (int i = 0; i < n; i++){
            if (ints[i] > max){
                max = ints[i];
            }
        }
        return max;

    }

    /*
    4 + 2n - необходимое алгоритму количество инструкций для пустого цикла for

    1,2,3,4
    4,3,2,1

   В теории алгоритмов рассматривается наихудщие сценарии, т.е у нас это массив,
   упорядочный по возрастанию и мак значение переиписывается для каждой итерации

   f(n) = 4 + 2n + 4n = 6n +4
   когда  n  сильно растет, константы можно не учитывать. Они не важны и отбрасываются
   f(n) = 6n
   f(n) = n

   f(n) = 8n + 45 -> f(n) = n
   f(n) = 456*1 -> f(n) = 1
   f(n) = n (в квадрате) + 4n + 432 -> f(n) = n (в квадрате)
   f(n) = n (в кубе) + 2000n + 300 -> f(n) = n (в кубе)

   Натация "большое О"
   О (f(n))
   O(1) -  алгоритм с константным временем и его сложность равна
   О(n) - сложность алгоритма О(n)
   O(n  в квадрате) сложность алгоритма n  в квадрате
   О (n в кубе)
   О (log n)

   2(*x) = 1024
   2(*10) = 1024
   лагорифм 1024 это степень в которую нужно возвести 2 чтобы получить 1024
   log(1024) = 10
   log(64) =
   2*6 степени = 64
     */

}
