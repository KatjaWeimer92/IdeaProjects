package inheritiance.dog;

public class SmallDog {
    private  String name;
    private String bread;

    public SmallDog(String name, String bread) {
        this.name = name;
        this.bread = bread;
    }

    public void  voiceSmallDog(){
        System.out.println("gav gav gav");
    }

    public void visitGroomer(){
        System.out.println();
    }
}
