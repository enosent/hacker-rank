package com.hacker.rank.java.introduction.step06;

import java.util.Scanner;

/**
 * Created by enosent on 2016. 5. 17..
 */
public class Solution {

    /*

Sample Input

2
0 2 10
5 3 5

Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
Explanation

In the first case:

1st term=0+1*2=2
2nd term=0+1*2+2*2=6
3rd term=0+1*2+2*2+4*2=14
     */

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for(int i = 0; i < t; i++) {

            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();

            for(int j = 1; j <= n; j++) {
                int sum = a;
                for(int k = 1; k <= j; k++) {
                    sum += Math.pow(2, k-1)*b;
                }
                System.out.print(sum + " ");
            }

            System.out.println();
        }
        scan.close();
    }
}

// # 간단한 해결법
/*
            for(int j=0;j<n;j++)
            {
                a+=b;
                if(j>0)
                System.out.print(" ");
                System.out.print(a);

                b=b*2;
            }
            System.out.println("");
            
            cf> 0 2 10
            
            1)
            a = 0 + 2
            b = 2 * 2
            
            2)
            a = (0+2) + (2*2)
            b = (2*2) * 2
            
            3)
            a = ((0+2) + (2*2)) + (2*2) * 2
            b = ((2*2) * 2) * 2
            ..            
*/