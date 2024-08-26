package inheritiance.dog;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Zeus", "Cane corso");
       dog.voice("Наша собака громко лает на дверь");

       SmallDog smallDog = new SmallDog("Gera", "Shiatsu");
       smallDog.voiceSmallDog();
       smallDog.visitGroomer();


    }
}
