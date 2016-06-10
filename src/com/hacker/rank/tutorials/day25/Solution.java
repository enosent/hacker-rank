package com.hacker.rank.tutorials.day25;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. */
		Scanner in = new Scanner(System.in);

		int T = in.nextInt();

		while(T-->0){
			/*
			int n = in.nextInt();
			
			-- caase
			3
			1000000007
			100000003
			1000003
			
			=> time out .. 

			int division = 0;
			for(int i = 1; i <= n; i++) {
				if(n%i == 0){
					division++;
				}
			}

			System.out.println( (division == 2)?"Prime":"Not prime" );
			*/
			
			BigInteger n = in.nextBigInteger();
			
			if( n.isProbablePrime(9)){
				System.out.println("Prime");
			} else {
				System.out.println("Not prime");
			}
			
		}

		in.close();
	}

}