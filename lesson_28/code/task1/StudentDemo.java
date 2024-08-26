package task1;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentGrades manager = new StudentGrades();

        manager.addStudent("Иван");
        manager.addGrade("Иван", "Математика", 5);
        manager.addGrade("Иван", "Физика", 4);
        manager.addStudent("Мария");
        manager.addGrade("Мария", "Математика", 4);
        manager.addGrade("Мария", "Физика", 4);

        System.out.print("Введите имя студента для получения его оценок: ");
        String studentName = scanner.nextLine();

        manager.printStudentGrades(studentName);
        scanner.close();
    }
}

