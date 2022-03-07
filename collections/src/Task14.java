import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task14 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");

        Optional<String> a = list.stream().findAny();
        System.out.println(a.get());

        Optional<String> b = list.stream().findFirst();
        System.out.println(b.get());
    }
}
