package com.hacker.rank.weekofcode.kangaroo;

import java.util.Scanner;

/**
 * Created by enosent on 2016. 6. 28..
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        if(x1 > x2 && v1 > v2) {
            System.out.println("NO");
        } else if(x2 > x1 && v2 > v1) {
            System.out.println("NO");
        } else if(x1 != x2 && v1 == v2){
            System.out.println("NO");
        } else{
            while(true) {
                x1 = (x1 + v1);
                x2 = (x2 + v2);

                if(x1 == x2) {
                    System.out.println("YES");
                    break;
                }
            }
        }
        in.close();
    }
}
