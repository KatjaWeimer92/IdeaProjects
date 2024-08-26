package homeWork;

public class StudentApple {
    public static void main(String[] args) {
        Student student = new Student(1, "Mark", "Black", 1998, "Computer Science");
        Student student1 = new Student(2, "Daniel", "Smith", 1994, "Psychology");
        Student student2 = new Student(3, "Petr", "Miller", 2001, "Economics");
        Student student3 = new Student(4, "Kate", "Brown", 1996, "History");

        student.displayStudent();
        student1.displayStudent();
        student2.displayStudent();
        student3.displayStudent();

    }
}
