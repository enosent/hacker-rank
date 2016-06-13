package com.hacker.rank.tutorials.day26;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		
		int da = in.nextInt();
		int ma = in.nextInt();
		int ya = in.nextInt();
		
		int de = in.nextInt();
		int me = in.nextInt();
		int ye = in.nextInt();
		
		
		if(ye < ya) {
			System.out.println(1000);
		} else if(ye == ya && me < ma) {
			System.out.println(500 * (ma - me));
		} else if(ye == ya && me == ma && de < da) {
			System.out.println(15 * (da - de));
		} else {
			System.out.println(0);
		}
		
		in.close();
	}
}