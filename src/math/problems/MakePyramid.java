package math.problems;

import java.util.Scanner;

public class MakePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noOfRows = sc.nextInt();

        int rowCount = 1;

        for (int i = noOfRows; i > 0; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print("* ");
            }

            System.out.println();

            rowCount++;
        }
    }
}
        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */



