package com.hacker.rank.java.step3;

import java.util.Scanner;

/**
 * Created by enosent on 2016. 5. 17..
 */
public class Solution {

    /*
        # Sample Input

        12
        4.0
        is the best place to learn and practice coding!

        # Sample Output

        16
        8.0
        HackerRank is the best place to learn and practice coding!
     */

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int inputInt = scan.nextInt();
        scan.nextLine();

        double inputDouble = scan.nextDouble();
        scan.nextLine();

        String inputStr = scan.nextLine();

        /* Read and save an integer, double, and String to your variables.*/
        int outputInt = inputInt + i;
        double outputDouble = inputDouble + d;
        String outputStr = s + inputStr;

        /* Print the sum of both integer variables on a new line. */
        System.out.println(outputInt);

        /* Print the sum of the double variables on a new line. */
        System.out.println(outputDouble);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(outputStr);

        scan.close();
    }
}
