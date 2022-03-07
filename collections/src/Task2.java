public class Task2 {
    public static void main(String[] args) {
        String[] cars = {"Subaru", "Bmw", "Suzuki"};
        System.out.println(cars[1]);
        System.out.println(cars.length);
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == "Suzuki") {
                cars[i] = "Honda";
                System.out.println("Pakeista");
            }
            System.out.println(cars[i]);
        }
    }

}
