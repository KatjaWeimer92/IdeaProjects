package homeWork.pet;

public class PetAppl {
    public static void main(String[] args) {
        Pet i = new Pet(1, "Labrador", 3, "Max");
        Pet i1 = new Pet(2, "Bulldog", 5, "Bella");
        Pet i2 = new Pet(3, "Beagle", 14, "Lucy");
        Pet i3 = new Pet(4, "Poodle", 2, "Rocky");
        Pet i4 = new Pet(5, "Hasky", 7, "Molly");

        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        i.sleep();
        i1.thereIs();
        i2.makeSound();
        i3.play();
        i4.walk();
    }
}
