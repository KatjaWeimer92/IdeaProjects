public class HomeWork {

    /*Написать метод, конвертирующий температуру из градусов Фаренгейта в градусы Цельсия по формуле С = 5*(F-32)/9.
    Значение градусов Фаренгейта должно передаваться как аргумент метода.
    Метод должен возвращать полученное значение в основную программу.
    Затем, в методе main вывести полученное значение на экран.*/

    public static void main(String[] args) {
        double fahrenheit = 451;

        System.out.println(( fahrenheit + "F -> " +(int) convertCelsius(fahrenheit) + "C"));

        double inch = 1000;
        System.out.println(inchToMeter(1000));

    }

    public static double convertCelsius(double fahrenheit){

        double celsius = 5 * (fahrenheit - 32.0)/9.0;

        return celsius;
    }

    public static double convertCelsius1(double fahrenheit){

        return 5 * (fahrenheit - 32.0)/9.0;
    }

     //Написать метод для перевода дюймов в метры. Один дюйм это 0.025 метра

    public static double inchToMeter(double inch){
        double meter = 0.0254 * inch;
        return meter;
    }

}
