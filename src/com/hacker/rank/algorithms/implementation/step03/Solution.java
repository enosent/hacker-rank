package com.hacker.rank.algorithms.implementation.step03;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		int[] utopianTree = new int[T];
		
		for(int i = 0; i < T; i++) {
			int N = in.nextInt();
			utopianTree[i] = N;
		}
		
		
		for(int i = 0; i < T; i++) {
			int height = utopianTree[i];
			
			int growing = 1;
			for(int h = 0; h < height; h++) {
				if(h%2 == 0) {
					growing *=2;
				} else {
					growing += 1;
				}
			}
			
			System.out.println(growing);
		}
		
		in.close();
	}
}