package com.hacker.rank.tutorials.day27;

import java.util.Scanner;

public class Solution {
	
	/*
	 * https://www.hackerrank.com/challenges/30-testing
	 * 
	 * 이해가 안됨 ㅡㅡ;; 이게 정답이라는데 
	 * 
    Solution(int n, int k, int[] a){
        System.out.println(n + " " + k);
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // number of test cases - each test case is two lines
        int testCases = 5; 
        
        System.out.println(testCases);
        new Solution(4, 3, new int[] {-1, 0, 4, 2});
        new Solution(5, 2, new int[] {0, -1, 2, 1, 4});
        new Solution(7, 6, new int[] {2, 0, -1, 1 , 1 , 1, 1});
        new Solution(3, 1, new int[] {-1, 0, 4});
        new Solution(6, 4, new int[] {0, -1, 1, 4, 5, 6});
    }
    
    망할 이해되었다 ..
    
    You must create five test cases to earn the maximum possible score.

	The output for your test case (were it to run against a correct solution to the problem above) must look like this:
	
	YES
	NO
	YES
	NO
	YES

	input 값을 직접 생성해라고 해서 Random 써서 했는데 결국은 저 답이 나오는 케이스를 만드는 거였어 ..
	 */

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Solution solution = new Solution();
		Scanner in = new Scanner(System.in);
		
		int T = 5;
		System.out.println(T);
		String[] result = new String[T];
		
		result[0] = solution.canceledCheck(4, 3, new int[] {-1, 0, 9, 2});
		result[1] = solution.canceledCheck(5, 2, new int[] {0, -1, 2, 1, 4});
		result[2] = solution.canceledCheck(7, 6, new int[] {2, 0, -5, 1 , 7 , 1, 1});
		result[3] = solution.canceledCheck(3, 1, new int[] {-1, 0, 4});
		result[4] = solution.canceledCheck(6, 4, new int[] {0, 1, 1, -4, 5, 6});
		
		
		for(int i = 0; i < result.length; i++){
			//System.out.println(result[i]);
		}
		
		in.close();
	}

	public String canceledCheck(int N, int K, int[] students) {
		System.out.println(N + " " + K);
		
		int safe = 0;
		for(int i = 0; i < students.length; i++) {
			int time = students[i];
			
			System.out.print(time + " ");
			students[i] = time;
			
			if(time <= 0){
				safe++;	
			}
		}
		System.out.println();
		
		return (safe < K)?"YES":"NO";
	}
}