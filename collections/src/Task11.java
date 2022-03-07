import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task11 {
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

        Map<Integer, Student> map = new HashMap<>();

        for (int i = 0; i < students.size(); i++) {
            map.put(students.get(i).getId(), students.get(i));
        }

        //map.put(students.get(1).getId(), students.get(1));
        //map.put(students.get(2).getId(), students.get(2));
        //map.put(students.get(3).getId(), students.get(3));

        System.out.println(map);

        map.get(2).setGrade(10);

        System.out.println(map);

        if (map.containsKey(4)) {
            map.get(4).setGrade(100);
            map.get(4).setAge(10);
        }


        System.out.println("------");

        for (Map.Entry<Integer, Student> student : map.entrySet()) {
            System.out.println(student.getKey() + " " + student);
        }
    }
}
