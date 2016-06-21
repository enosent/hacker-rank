package com.hacker.rank.java.datastructure.step03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		in.nextLine();
		
		for(int i = 0; i < N; i++) {
			int L = in.nextInt();
			
			List<Integer> temps = new ArrayList<Integer>();
			for(int j = 0; j < L; j++) {
				temps.add( in.nextInt() );
			}
			
			list.add(temps);
		}
		
		int T = in.nextInt();
		
		for(int i = 0; i < T; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			
			List<Integer> target = list.get(x-1);
			
			if( target.size() <= (y-1)) {
				System.out.println("ERROR!");
			} else {
				Integer result = target.get((y-1));
				System.out.println(result);
			}
			
		}
		
		in.close();
	}

}
