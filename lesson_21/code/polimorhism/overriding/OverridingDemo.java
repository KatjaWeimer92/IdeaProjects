package polimorhism.overriding;

public class OverridingDemo extends  Vehicles{

    // Overriding - переопределение методов (например родительского класса)

    @Override
    void drive() {
        System.out.println("Управление автомобилем");
    }
}
