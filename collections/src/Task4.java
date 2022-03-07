import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jomile");
        names.add("Tomas");
        names.add("Mantas");

        //names.add(1);
        //names.add(2);

        //System.out.println(names.get(0).getClass());

        for (String name : names) {
            System.out.println(name);
        }

        names.remove(0);
        System.out.println("-------");
        for (String name : names) {
            System.out.println(name + " ");
        }
    }
}
