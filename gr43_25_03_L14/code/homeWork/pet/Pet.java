package homeWork.pet;

public class Pet {

    private int id;
    private String view;
    private  int age;
    private String nickname;

    public Pet(int id, String view, int age, String nickname) {
        this.id = id;
        this.view = view;
        this.age = age;
        this.nickname = nickname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", view='" + view + '\'' +
                ", age=" + age +
                ", nickname='" + nickname + '\'' +
                '}';
    }
    public void sleep(){
        System.out.println(nickname + " is sleep.");
    }
    public void thereIs(){
        System.out.println(nickname + " is there is.");
    }
    public void makeSound(){
        System.out.println(nickname + " is make sound.");
    }
    public void play(){
        System.out.println(nickname + " is play.");
    }
    public void walk(){
        System.out.println(nickname + " is walk.");
    }
}
