package inheritiance;

import inheritiance.dog.BigDog;

public class DogDemoInheritiance {
    public static void main(String[] args) {

        BigDog bigDog = new BigDog("Zeus", "Cane corso");

        System.out.println(bigDog.getName());

        System.out.println(bigDog);

        bigDog.voice("Big dog - inheritance class Dog");
    }
}
