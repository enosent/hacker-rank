package com.hacker.rank.java.biginteger.step01;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		
		BigInteger a = in.nextBigInteger();
		BigInteger b = in.nextBigInteger();
		
		System.out.println( a.add(b) );
		System.out.println( a.multiply(b) );
		
		in.close();
	}

}