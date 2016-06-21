package com.hacker.rank.java.datastructure.step04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int t = 0; t < T; t++ ) {
			
			int n = in.nextInt();
			int m = in.nextInt();
			
			List<Integer> games = new ArrayList<Integer>();
			
			for(int i = 0; i < n; i++) {
				games.add(in.nextInt());
			}
			

		}
		
		
		
		in.close();
	}
}