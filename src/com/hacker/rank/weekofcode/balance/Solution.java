package com.hacker.rank.weekofcode.balance;

import java.util.Scanner;

/**
 * Created by enosent on 2016. 6. 28..
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        int Ks = in.nextInt();

        int[] contents = new int[T];

        int[] L = new int[T];
        int[] K = new int[T];
        for(int i = 0; i < T; i++) {
            L[i] = in.nextInt();
            K[i] = in.nextInt();
        }

        int max = 0;
        for(int i = 0; i < T; i++) {
            max += L[i];
        }

        int maxLuck = 0;
        for(int i = 0; i < T; i++) {
            int contest = ( K[i] > Ks)?Ks:K[i];

            int temp = max;
            for(int j = 0; j < contest; j++) {
                temp = (temp - L[i]);
                System.out.println(contest +  " . " + temp);
            }

            if(maxLuck < temp) {
                maxLuck = temp;
            }
        }

        System.out.println(maxLuck);

        in.close();
    }
}