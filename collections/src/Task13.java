import java.util.*;

public class Task13 {
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

        Collections.sort(students, new AgeComparator());

        for (Student student:students){
            System.out.println(student);
        }
    }
}
