package com.hacker.rank.java.datastructure.step04;

import java.util.Scanner;

public class Solution {
	
	private static boolean isSolvable(int m, int[] arr, int i) {
	    if (i < 0 || arr[i] == 1) return false;
	    if ((i == arr.length - 1) || i + m > arr.length - 1) return true;

	    arr[i] = 1; // marking..  필요한 이유가 무엇일지 .. 반드시 확인할 것
	    return isSolvable(m, arr, i + 1) || isSolvable(m, arr, i - 1) || isSolvable(m, arr, i + m);
	}

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		Boolean[] results = new Boolean[T];
		
		for(int t = 0; t < T; t++ ) {
			
			int N = in.nextInt();
			int jumped = in.nextInt();
			
			int[] games = new int[N];

			for(int n = 0; n < N; n++) {
				games[n] = in.nextInt();
			}

			results[t] = isSolvable(jumped, games, 0);
		}
		
		for(int t = 0; t < T; t++ ) {
			System.out.println( results[t]?"YES":"NO");
		}
		
		
		in.close();
	}
}



/*

private static boolean isSolvable(int m, int[] arr, int i) {
    if (i < 0 || arr[i] == 1) return false;
    if ((i == arr.length - 1) || i + m > arr.length - 1) return true;

    arr[i] = 1;
    return isSolvable(m, arr, i + 1) || isSolvable(m, arr, i - 1) || isSolvable(m, arr, i + m);
}

# 재귀함수 분석 결과


#Array => { 0, 0, 1, 1, 1, 0 }

isSolvable( 3, #Array, 0 ) => 1step


( 1 ) 
isSolvable( 3, #Array, 0 )
	|
	|_ isSolvable( 3, #Array, 0 + 1 ) ==> false || isSolvable( 3, #Array, 0 - 1 ) || isSolvable( 3, #Array, 0 + 3 )


	( 1-1 )
	isSolvable( 3, #Array, 0 + 1 )
		|
		|_ 반환 값 없음 
		|
		|_ isSolvable( 3, #Array, (0+1) + 1 ) ==> false || isSolvable( 3, #Array, (0+1) - 1 ) ==> false || isSolvable( 3, #Array, (0+1) + 3 ) ==> false


		(1-1-1)
		isSolvable( 3, #Array, (0+1) + 1 )
			| 
			|_ return false

				(1-1-2)
				isSolvable( 3, #Array, (0+1) - 1 )
					|
					|_ return false;


					(1-1-3)
					isSolvable( 3, #Array, (0+1) + 3 )
						|
						|_ return false;

	(1-2)
	isSolvable( 3, #Array, 0 - 1 )
		| 
		|_ return false

	(1-3)
	isSolvable( 3, #Array, 0 + 3 )
		| 
		|_ return false

*/		