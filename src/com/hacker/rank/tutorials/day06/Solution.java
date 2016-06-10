package com.hacker.rank.tutorials.day06;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt( in.nextLine() );
		
		String[] str = new String[N];
		
		for(int i = 0; i < N; i++) {
			String s = in.nextLine();
			str[i] = s;
		}
		
		for(int i = 0; i < N; i++) {
			String s = str[i];
			
			String[] arr = s.split("");
			
			String oddResult = "";
			String evenResult = "";
			
			for(int j = 0; j < arr.length; j++) {
				if(j%2 == 0) {
					evenResult += arr[j];
				} else {
					oddResult += arr[j];
				}
			}
			
			System.out.println(evenResult + " " + oddResult);
		}
		
		in.close();
	}
}