package com.hacker.rank.tutorials.day16;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	
    	String str = in.nextLine();
    	
    	try {
			int parseInt = Integer.parseInt(str);
			
			System.out.println(parseInt);
		} catch (NumberFormatException e) {
			System.out.println("Bad String");
		}
    	
    	in.close();
    }
}