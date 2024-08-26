package inheritiance.fruits;

public class Apple extends Fruit{

    public String color;

    public Apple(String[] vitamins, int sugar, String color) {
        super(vitamins, sugar);
        this.color = color;
    }
}
