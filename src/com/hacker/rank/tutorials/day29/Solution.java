package com.hacker.rank.tutorials.day29;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);

		int T = in.nextInt();

		int[] results = new int[T];

		int idx = 0;
		while(T-->0) {
			int N = in.nextInt();
			int K = in.nextInt();

			int max = 0;

			for(int i = 1; i <= N; i++) {
				for(int j = i+1; j <= N; j++) {
					int calc = i&j;

					if(calc < K && calc > max) {
						max = calc;
					}
				}
			}

			results[idx] = max;
			idx++;
		}

		for(int i = 0 ; i < results.length; i++) {
			System.out.println( results[i] );
		}

		in.close();
	}
}