package firma.model;

public class Employee {

    // fields
    private int id;
    private String name;
    private String lastNames;
    private int age;
    private boolean gender;
    private double salary;

    // construktor


    public Employee(int id, String name, String lastNames, int age, boolean gender, double salary) {
        this.id = id;
        this.name = name;
        this.lastNames = lastNames;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastNames='" + lastNames + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }

    public void work(){
        System.out.println(name + " is working! ");

    }

    public void lunch(){
        System.out.println(name + " " + lastNames + " is eating lunch.");
    }

    public void sleep(){
        System.out.println(name + " " + lastNames + " age: " + age + " is sleeping.");

    }
}
