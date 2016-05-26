package com.hacker.rank.java.introduction.step9;

import java.util.Scanner;

public class Solution {
	
	private static int B = 0;
	private static int H = 0;
	private static boolean flag =  false;
	
	static {
		Scanner scan = new Scanner(System.in);
		
		B = scan.nextInt();
		H = scan.nextInt();
		
		if(B <= 0 || H <= 0) {
			System.out.print("java.lang.Exception: Breadth and height must be positive");
		} else {
			flag = true;
		}
		
		scan.close();
	}
	
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}

	}//end of main

}//end of class
