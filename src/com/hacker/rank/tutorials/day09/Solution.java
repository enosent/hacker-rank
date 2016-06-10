package com.hacker.rank.tutorials.day09;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		Solution solution = new Solution();
		int result = solution.factorial(N);
		
		System.out.println(result);
		
		in.close();
	}
	
	
	public int factorial(int n) {
		if( n > 0) {
			return n * factorial(n-1);
		} else {
			return 1;
		}
	}
}