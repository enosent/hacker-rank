package com.hacker.rank.tutorials.day1;

import java.util.Scanner;

/**
 * Created by enosent on 2016. 5. 17..
 */
public class Solution {

    /*
This problem will test your knowledge on "if-else" statements.

Given an integer  as input, check the following:

If  is odd, print "Weird".
If  is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
If  is even and, in between the range of 6 and 20(inclusive), print "Weird".
If  is even and , print "Not Weird".
We given you partially completed code in the editor, complete it to solve the problem.

Input Format

There is a single line of input: integer .

Constraints


Output Format

Print "Weird" if the number is weird. Otherwise, print "Not Weird". Do not print the quotation marks.
     */

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();

        String ans="";

        if(n%2==1){
            ans = "Weird";
        }
        else{
            //Complete the code
            if( n >= 2 && n <= 5) {
                ans = "Not Weird";
            } else if(n >= 6 && n <= 20) {
                ans = "Weird";
            } else {
                ans = "Not Weird";
            }
        }
        System.out.println(ans);

        sc.close();
    }
}