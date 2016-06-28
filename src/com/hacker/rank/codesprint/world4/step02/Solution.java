package com.hacker.rank.codesprint.world4.step02;

import java.util.Scanner;

/**
 * Created by enosent on 2016. 6. 26..
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        int h1[] = new int[n1];

        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
        }

        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
        }

        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
        }

        int h1_sum = 0;
        for(int i = 0; i < h1.length; i++) {
            h1_sum += h1[i];
        }
        int h2_sum = 0;
        for(int i = 0; i < h2.length; i++) {
            h2_sum += h2[i];
        }
        int h3_sum = 0;
        for(int i = 0; i < h3.length; i++) {
            h3_sum += h3[i];
        }

        int min = (h1.length > h2.length)?h2_sum:h1_sum;
        min = (h2.length > h3.length)?h3.length:min;



    }

}
