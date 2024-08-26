public class Main {

    public static double calculateArea(double radius){

        double area = Math.PI * radius * radius;
        //System.out.println("Circle area is " + area);
        return area;
    }




    public static void main(String[] args) {
        double result;

        result = calculateArea(15.5);
        result = calculateArea(20.0);
        result = calculateArea(30.0);

        System.out.println(result);

        /*
        Написать метод для перевода дюймов в метры. Один дюйм это 0.025 метра.
         */
    }




    /*

      [модификаторы]    тип_возвращаемого_значения    имя_метода( [параметры] )
      {
      // тело метода

      [return]
      }
     */


}
