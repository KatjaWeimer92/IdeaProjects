package task1;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
     private Map<String, Student> students;

     public StudentGrades() {
          students = new HashMap<>();
     }
     public void addStudent(String name) {
          students.putIfAbsent(name, new Student(name));
     }
     public void addGrade(String name, String subject, int grade) {
          Student student = students.get(name);
          if (student != null) {
               student.addGrade(subject, grade);
          } else {
               System.out.println("Студент с именем " + name + " не найден.");
          }
     }
     public Student getStudent(String name) {
          return students.get(name);
     }
     public void printStudentGrades(String name) {
          Student student = getStudent(name);
          if (student != null) {
               System.out.println("Оценки для студента " + name + ":");
               for (Map.Entry<String, Integer> entry : student.getGrades().entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
               }
          } else {
               System.out.println("Студент с именем " + name + " не найден.");
          }

     }
}
