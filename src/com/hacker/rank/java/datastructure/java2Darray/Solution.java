package com.hacker.rank.java.datastructure.java2Darray;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for(int i=0; i < 6; i++){
			for(int j=0; j < 6; j++){
				arr[i][j] = in.nextInt();
			}
		}
		
		int max = -64, sum = 0;
		for(int row = 0; row <= arr.length-3;  row++) {
			
			for(int col = 0; col <= arr[row].length - 3; col++) {
				sum = arr[row][col] + arr[row][col + 1] + arr[row][col + 2] + arr[row + 1][col + 1] + arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
				
				if( sum > max) {
					max = sum;
				}
			}
		}
		
		System.out.println( max );
		
		in.close();
	}
}