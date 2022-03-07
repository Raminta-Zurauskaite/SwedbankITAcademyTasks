import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        //prints the array before conversion
        System.out.println("Array before conversion: " + Arrays.toString(array));
        //calling the generic function that converts Array into List
        List<Integer> list = (List<Integer>) ArrayToListConversion(array);
        //print the List
        System.out.println("Array as List: " + list);
    }

    //creating a generic function that converts the Array into List
    public static <T> List<Integer> ArrayToListConversion(int[] array) {
        //creating the constructor of the List class
        List<Integer> list = new ArrayList<>();
        //using for-each loop to iterate over the array
        for (int t : array) {
            //adding each element to the List
            list.add(t);
        }
        //returns the list converted into Array
        return list;
    }
}
