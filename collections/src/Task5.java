import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        Student student1 = new Student ("Simas", 27, 3);
        Student student2 = new Student ("Tomas", 24, 1);
        Student student3 = new Student ("Rapolas", 25, 2);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (Student student:students) {
            System.out.println(student.getName());
        }

    }
}
