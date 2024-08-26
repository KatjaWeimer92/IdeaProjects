public class HomeWork {
    public static void main(String[] args) {
        String[] fruits = {"Kiwi", "Orange", "Apple", "Mango"};

        for ( int i = 0; i < fruits.length; i++) {
            if (i % 2 != 0) {
                System.out.println(fruits[i]);
            }

        }
        System.out.println();
        int[] ints = {1,2,8,7};
        System.out.println(countEven(ints));

    }

    public static int countEven(int[] numbers){

        int counter = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                counter++;
            }
        }
        return counter;
    }
}
