package com.hacker.rank.java.step8;

import java.util.Scanner;

/**
 * Created by enosent on 2016. 5. 20..
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int i = 1;
        while(scan.hasNext()){
            System.out.println(i + " " + scan.nextLine());
            i++;
        }

        scan.close();
    }
}
