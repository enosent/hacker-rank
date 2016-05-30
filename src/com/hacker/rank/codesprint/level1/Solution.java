package com.hacker.rank.codesprint.level1;

import java.util.Scanner;

/**
 * Created by enosent on 2016. 5. 22..
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        int alice = 0;
        int bob = 0;

        int[] aliceArr = new int[]{ a0, a1, a2 };
        int[] bobArr = new int[]{ b0, b1, b2 };

        for(int i = 0; i < 3; i++) {
            if( aliceArr[i] > bobArr[i] ) {
                alice++;
            } else if( aliceArr[i] < bobArr[i] ) {
                bob++;
            } else {
                // nothing
            }
        }

        System.out.println(alice + " " + bob);
    }
}