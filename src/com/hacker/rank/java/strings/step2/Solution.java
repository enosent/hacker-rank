package com.hacker.rank.java.strings.step2;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		int n = in.nextInt();
		
		String largest = "";
		String smallest = "";
		
		for(int i = 0 ; i <= text.length() - n; i++) {
			String sub = text.substring(i, i + n);
			if( i ==  0 ) {
				largest = sub;
				smallest = sub;
			} else {
				largest = (sub.compareTo(largest) > 0)?sub:largest;
				smallest = (sub.compareTo(smallest) > 0)?smallest:sub;
			}
		}
		
		System.out.println(smallest);
		System.out.println(largest);
		
		in.close();
	}
	
}