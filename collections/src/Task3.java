public class Task3 {
    public static void main(String[] args) {
        int[] intArray = {40,55,63,17,22,68,89,97,89};

        String allElements = "";

        for (int i = 0; i < intArray.length; i++) {
            allElements = allElements + " " + intArray[i];
        }
        System.out.println(allElements);
    }
}
