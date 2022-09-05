public class Recursion {
    public static void main(String[] args) {
        int factSequence = factorial(5);
        System.out.println(factSequence);
        System.out.println();
        System.out.println(fibonacci(7));
        System.out.println();
        System.out.println(reverse("Sirun"));
        System.out.println();
        System.out.println(countDown(5));
    }

    //1. Write a program to calculate factorial using recursion in Java
    public static int factorial(int number) {
        if (number == 0)
            return 1;
        return number * factorial(number - 1);
    }

    //2. Write a program to Print Fibonacci Series in Java using Recursion
    public static int fibonacci(int fibNum) {
        if (fibNum == 1 || fibNum == 2)
            return 1;
        return fibonacci(fibNum - 1) + fibonacci(fibNum - 2);
    }

    //3. Write a program to reverse String in Java using Recursion
    public static String reverse(String str) {
        if (str.length() <= 1)
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

    /* 4. Write a countDown(int number) method in Java using Recursion which
       prints countdown till zero to console, like count(3) should print 3 2 1 0 */

    public static int countDown(int number) {
        if (number == 0)
            return number;
        System.out.println(number);
        return countDown(number - 1);
    }
}


