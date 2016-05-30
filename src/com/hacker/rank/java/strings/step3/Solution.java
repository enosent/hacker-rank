package com.hacker.rank.java.strings.step3;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		/* Enter your code here. Print output to STDOUT. */

		String[] split = A.trim().split("");
		
		boolean isPalindrome = true;
		
		int len = split.length -1;
		
		for(int i = 0; i < (len/2); i++) {
			if( !split[i].equals( split[ len-i])) {
				isPalindrome = false;
			}
		}
		
		System.out.println( isPalindrome?"Yes":"No" );
		
		sc.close();
	}
}