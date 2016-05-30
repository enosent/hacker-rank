package com.hacker.rank.java.strings.step4;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	static boolean isAnagram(String A, String B) {
		//Complete the function
		String[] arrA = A.toLowerCase().split("");
		String[] arrB = B.toLowerCase().split("");
		
		if(arrA.length == arrB.length) {
			
			Arrays.sort(arrA);
			Arrays.sort(arrB);
			
			for(int i = 0; i < arrA.length; i++) {
				if(!arrA[i].equals(arrB[i])) {
					return false;
				}
			}
			
			return true;
			
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();
		boolean ret=isAnagram(A,B);
		if(ret)System.out.println("Anagrams");
		else System.out.println("Not Anagrams");

		sc.close();
	}
}