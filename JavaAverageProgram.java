// Implement average calculation in Java program using varargs

public class App {
    public static double avg(int... numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int nums : numbers) {
            sum += nums;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        System.out.println(avg(10, 20, 30, 40, 50));
    }
}
