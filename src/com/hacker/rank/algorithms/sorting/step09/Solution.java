package com.hacker.rank.algorithms.sorting.step09;

import java.util.Scanner;

/*
# 문제 
	- 사전식 순열 ( https://www.nayuki.io/page/next-lexicographical-permutation-algorithm )
	
	어떤 대상을 순서에 따라 배열한 것을 순열이라고 함 .. ( permutation : 순열 )

	e.g ) 3124 - 1, 2, 3, 4로 만들 수 있는 순열 중 하나
	
	이렇게 만들 수 있는 모든 순열을 숫자나 문자 순으로 늘어놓은 것을 사전식 순열이라고 함 ( lexicographical permutation algorithm )
 */

public class Solution {
	static boolean nextPermutation(char[] array) {
		// Find longest non-increasing suffix
		int i = array.length - 1;
		while (i > 0 && array[i - 1]  >= array[i])
			i--;
		// Now i is the head index of the suffix

		// Are we at the last permutation already?
		if (i <= 0)
			return false;

		// Let array[i - 1] be the pivot
		// Find rightmost element that exceeds the pivot
		int j = array.length - 1;
		while (array[j] <= array[i - 1])
			j--;
		// Now the value array[j] will become the new pivot
		// Assertion: j >= i

		// Swap the pivot with j
		char temp = array[i - 1];
		array[i - 1] = array[j];
		array[j] = temp;

		// Reverse the suffix
		j = array.length - 1;
		while (i < j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}

		// Successfully computed the next permutation
		return true;
	}

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = Integer.parseInt(in.nextLine());
		
		String[] texts = new String[T];
		
		int idx = 0;
		while(T-->0) {
			texts[idx] = in.nextLine();
			idx++;
		}
		
		for(int i = 0; i < texts.length; i++) {
			String text = texts[i];
			String max = text;
			
			char[] array = text.toCharArray();
			do {  // Must start at lowest permutation
				
				String result = new String(array);
//				System.out.println(result);
				
				if( max.compareTo(result) < 0) {
					max = result;
					break;
				}
			} while (nextPermutation(array));
			
			System.out.println((max.equals(text))?"no answer":max);
		}
		
		in.close();
	}
}
