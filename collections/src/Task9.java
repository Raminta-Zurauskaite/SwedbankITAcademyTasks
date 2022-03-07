import java.util.*;

public class Task9 {
     public static void main(String[] args) {
          ArrayList<String> fruits = new ArrayList<>();

          fruits.add("Apple");
          fruits.add("Pear");
          fruits.add("Banana");
          fruits.add("Apple");
          fruits.add("Cherry");
          fruits.add("Fig");
          fruits.add("Orange");
          fruits.add("Banana");
          fruits.add("Apple");

          Set<String> uniqueFruits = new HashSet<>(fruits);
          //uniqueCarNames.addAll(carNames); //alternative version

          for (String fruit : uniqueFruits) {
               System.out.println(fruit);

          }

          System.out.println("HashSet size is " + uniqueFruits.size());

          System.out.println("--------");

          Set<String> uniqueFruitsTree = new TreeSet<>(fruits);

          for (String fruit : uniqueFruitsTree) {
               System.out.println(fruit + " ");
          }
          System.out.println("Tree size is " + uniqueFruitsTree.size());

     }
}
