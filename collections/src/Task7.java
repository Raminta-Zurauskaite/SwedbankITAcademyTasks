import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        Student student1 = new Student("Simas", 27, 3);
        Student student2 = new Student("Tomas", 24, 1);
        Student student3 = new Student("Rapolas", 25, 2);
        Student student4 = new Student("Jon", 20, 5);
        Student student5 = new Student("Doe", 30, 4);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);


        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAge() > 25) {
                students.remove(i);
                i--;
            } else {
                System.out.println(students.get(i).toString());
            }
        }
        System.out.println(students);
    }
}
