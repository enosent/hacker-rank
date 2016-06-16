package com.hacker.rank.java.biginteger.step02;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	@SuppressWarnings("resource")
	public static void main(String []argh) {
		//Input
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		String []s=new String[n];

		for(int i=0;i<n;i++) {
			s[i]=sc.next();
		}

		//Write your code here
		Arrays.sort(s, (a, b) -> {
			BigDecimal p1 = new BigDecimal(a);
			BigDecimal p2 = new BigDecimal(b);
			return p2.compareTo(p1);
		});


		//Output
		for(int i=0;i<n;i++) {
			System.out.println(s[i]);
		}

		sc.close();
	}


}