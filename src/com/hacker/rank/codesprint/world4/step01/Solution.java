package com.hacker.rank.codesprint.world4.step01;

/**
 * Created by enosent on 2016. 6. 26..
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }

        int min = A.length;
        for( int i = 0; i < A.length; i++) {

            for(int j = A.length-1; j > i; j--) {
                if(A[i] == A[j]) {
                    int distance = Math.abs(i-j);

                    if(distance < min) {
                        min = distance;
                    }
                }
            }
        }

        System.out.println((min == A.length)?-1:min);
    }
}
