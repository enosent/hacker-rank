package com.hacker.rank.weekofcode.lazysorting;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Solution {
	
	private static int bogo(int[] arr, int P) {
		//Keep a track of the number of shuffles
		int shuffle=1;
		for(;!isSorted(arr);shuffle++)
			shuffle(arr, P);
		//Boast
		//System.out.println("This took "+shuffle+" shuffles.");
		return shuffle;
	}
	
	private static void shuffle(int[] arr, int P) {
		//Standard Fisher-Yates shuffle algorithm
		Random r = new Random();
		
		int i=arr.length-1;
		while(i>0)
			swap(arr,i--,(int)(r.nextInt(P)*i));
	}
	
	private static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	private static boolean isSorted(int[] arr) {

		for(int i=1;i<arr.length;i++)
			if(arr[i]<arr[i-1])
				return false;
		return true;
	}
	
	/*
	private static void display1D(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	*/

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		
		int P = in.nextInt();
		
		int[] arr = new int[P];
		for(int i = 0; i < P; i++) {
			arr[i] = in.nextInt();
		}
		
		DecimalFormat fmt = new DecimalFormat("0.000000");
		int shuffle = bogo(arr, P);
		
		System.out.println(fmt.format(shuffle));
		
		in.close();
		

		//Enter array to be sorted here
		/*
		int[] arr={5, 2};

		System.out.print("Unsorted: ");
		display1D(arr);

		bogo(arr, 2);

		System.out.print("Sorted: ");
		display1D(arr);
		*/
	}
}
