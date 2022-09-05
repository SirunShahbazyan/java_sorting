import java.util.Random;

public class InsertionOrder {
    public static void main(String[] args) {


        Random rand = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
            System.out.print(numbers[i] + " ");

        }

        System.out.println("\n");

        for (int i = 1; i < numbers.length; i++) {
            int currentValue = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > currentValue) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = currentValue;

        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}