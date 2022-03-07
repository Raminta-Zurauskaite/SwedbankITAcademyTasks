import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task12 {
    public static void main(String[] args) {
        Integer array[] = {5, 78, 19};
        List<Integer> list = new ArrayList(Arrays.asList(array));
        for (Integer element : list) {
            System.out.print(element + " ");
        }

        System.out.println("");

        list.sort(Comparator.naturalOrder());
        for (Integer element : list) {
            System.out.print(element + " ");
        }

        System.out.println("");

        list.sort(Comparator.reverseOrder());
        for (Integer element : list) {
            System.out.print(element + " ");
        }
    }
}
