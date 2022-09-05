import java.util.Random;

public class BubbleSorting {
    public static void main(String[] args) {


        Random rand = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n");

        boolean swappedSomething = true;

        while (swappedSomething) {
            swappedSomething = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swappedSomething = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        for (int number: numbers) {
            System.out.print(number + " ");
        }
    }
}