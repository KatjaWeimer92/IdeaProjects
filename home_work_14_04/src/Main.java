public class Main {

    public static void main(String[] args) {

        System.out.println(sum(2,2));

        double result;
        result = calculateCelsius(78.5);
        System.out.println("degrees Celsius = " + result);
    }

    public static int sum(int a, int b){
        int sum = a + b;
        return sum;

    }

    public static double calculateCelsius(double f){
        double c = 5*(f-32)/9;
        return c;
    }

}
