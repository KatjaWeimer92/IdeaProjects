package inheritiance.fruits;

public class Pineapple extends Fruit{

    public double weight;

    public Pineapple(String[] vitamins, int sugar, double weight) {
        super(vitamins, sugar);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
