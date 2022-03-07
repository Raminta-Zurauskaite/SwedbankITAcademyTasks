public class Task1 {
    public static void main(String[] args) {
        int[] intArray = {10, 15, 20};

        intArray[0] = 25;

        //intArray[3] = 25; //out of bounds exceptions

        for (int element : intArray) {
            System.out.println(element);
        }
    }
}
