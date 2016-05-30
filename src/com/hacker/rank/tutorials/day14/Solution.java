package com.hacker.rank.tutorials.day14;

import java.util.Scanner;



class Difference {
	private int[] elements;
	public int maximumDifference;
	
	public Difference(int[] elements) {
		this.elements = elements;
	}
	
	public void computeDifference() {
		int maxDiff = 0;
		int len = elements.length;
		
		for(int i = 0; i < len; i++) {
			
			for(int j = (i+1); j < len; j++) {
				int diff = elements[i] - elements[j];
				int abs = (diff < 0)?diff*-1: diff;
				
				if( abs > maxDiff) {
					maxDiff = abs;
				}
			}
			
		}
		
		this.maximumDifference = maxDiff;
	}
}

public class Solution {        
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		Difference D = new Difference(a);

		D.computeDifference();

		System.out.print(D.maximumDifference);
		
		sc.close();
	}
}