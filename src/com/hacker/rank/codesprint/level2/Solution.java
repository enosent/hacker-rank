package com.hacker.rank.codesprint.level2;

import java.util.Scanner;

/**
 * Created by enosent on 2016. 5. 22..
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String number = in.next();

        boolean isSolved = true;

        int[] result = new int[n];

        for(int i = 0; i < n/2; i++) {
            int a1 = Integer.parseInt(String.valueOf(number.charAt(i)));
            int a2 = Integer.parseInt(String.valueOf(number.charAt((n-1)-i)));

            if(a1 != a2) {
                if(k == 0) {
                    isSolved = false;
                    break;
                } else {
                    if(a1 == 0) a1 = 9;

                    if(a1 > a2) {
                        result[i] = a1;
                        result[(n-1)-i] = a1;
                    } else if( a1 < a2) {
                        result[i] = a2;
                        result[(n-1)-i] = a2;
                    }
                    k--;
                }
            } else {
                result[i] = a1;
                result[(n-1)-i] = a2;
            }
        }

        if(isSolved) {
            String print = "";
            for(int rs : result ){
                print += rs;
            }
            System.out.println(print);
        } else {
            System.out.println(-1);
        }
        
        in.close();
    }
}