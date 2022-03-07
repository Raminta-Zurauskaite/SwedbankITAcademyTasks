import java.util.HashMap;
import java.util.Map;

public class Task10 {
    public static void main(String[] args) {
        Map<Integer, String> vardai = new HashMap<>();
        vardai.put(1, "Simas");
        vardai.put(2, "Tomas");
        vardai.put(3, "Mantas");
        vardai.put(4, "Eliza");

        System.out.println(vardai);

        if (vardai.containsKey(3)) {
            vardai.put(3, "Joana");
        }
        System.out.println("-------");
        System.out.println(vardai);
        System.out.println("-------");

        for (Map.Entry<Integer, String> vardas : vardai.entrySet()) {
            System.out.println(vardas.getKey() + " " + vardas.getValue());
        }
    }
}
