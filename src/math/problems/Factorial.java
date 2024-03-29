package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        int i;
        int fact = 1;
        int number = 5;
        fact = factorial(number);
        System.out.println("Factorial number is " + number + fact);
    }

}
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
