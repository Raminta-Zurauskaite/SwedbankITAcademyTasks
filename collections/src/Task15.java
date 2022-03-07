import java.util.ArrayList;
import java.util.List;

public class Task15 {
    public static void main(String[] args) {
        Student a = new Student(1, "Jonas", 25, 4);
        Student b = new Student(2, "Petras", 24, 3);
        Student c = new Student(3, "Jon", 23, 2);
        Student d = new Student(4, "Doe", 22, 1);

        List<Student> students = new ArrayList<>();
        students.add(a);
        students.add(b);
        students.add(c);
        students.add(d);

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("------");
        System.out.println(students.stream().findAny());
        System.out.println("------");
        System.out.println(students.stream().findFirst());
        System.out.println("------");

        students.stream().forEach(student -> student.setGrade(10));

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("------");
        List<Student> newStudent = students.stream().toList();
        System.out.println(newStudent);
        System.out.println("------");
        List<Student> notJonas = students.stream().filter(student -> !student.getName().equals("Jonas")).toList();
        System.out.println(notJonas);
        System.out.println("------");
    }
}
