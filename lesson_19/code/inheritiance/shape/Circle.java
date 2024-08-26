package inheritiance.shape;

public class Circle {

    private String title;
    private  double radius;

    public Circle(String title, double radius) {
        this.title = title;
        this.radius = radius;
    }

    public String getTitle() {
        return title;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter(){
        return 2* Math.PI * radius;
    }
}
