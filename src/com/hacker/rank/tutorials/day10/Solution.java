package com.hacker.rank.tutorials.day10;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		String binary = Integer.toBinaryString(n);
		
		String[] numbers = binary.split("");
		
		int max = 0;
		int consecutive = 0;
		for(String num : numbers) {
			if("1".equals(num)) {
				consecutive++;
				
				if(consecutive > max) {
					max = consecutive;
				}
			} else {
				
				if(consecutive > max) {
					max = consecutive;
				}
				
				consecutive = 0;
			}
		}
		
		System.out.println(max);
		
		in.close();
	}

}