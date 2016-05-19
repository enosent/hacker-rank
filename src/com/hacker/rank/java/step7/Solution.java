package com.hacker.rank.java.step7;

import java.util.Scanner;

/**
 * Created by enosent on 2016. 5. 20..
 */
public class Solution {

    /*
    https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

    byte < short < int < long

     */
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++) {

            try {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code

                if(x>= Short.MIN_VALUE && x<= Short.MAX_VALUE)System.out.println("* short");

                if(x>= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println("* int");

                if(x>= Long.MIN_VALUE && x <= Long.MAX_VALUE) System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}