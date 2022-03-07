import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        List<String> carNames = Arrays.asList("Subaru", "Bmw", "Subaru");

        Set<String> uniqueCarNames = new HashSet<>(carNames);
        //uniqueCarNames.addAll(carNames); //alternative version

        for (String carName : uniqueCarNames) {
            System.out.println(carName);

        }

        Set<String> uniqueCarNamesTree = new TreeSet<>(uniqueCarNames);

        for (String carName : uniqueCarNamesTree) {
            System.out.println(carName + " ");
        }

    }
}
