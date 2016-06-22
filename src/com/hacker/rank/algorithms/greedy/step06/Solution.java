package com.hacker.rank.algorithms.greedy.step06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	/*
	 * 
	 * Algorithms > Greedy > Two arrays
	 * https://www.hackerrank.com/challenges/two-arrays?utm-source=june-world-codesprint-reminder-4days&utm-medium=email&utm-campaign=june-world-codesprint
	 * 
	 * 문제 솔직히 이해안감 ㅡㅡ;;
	 * 
		You are given two integer arrays, A and B, each containing N integers. The size of the array is less than or equal to 1000. You are free to permute the order of the elements in the arrays.
		
		Now here's the real question: Is there an permutation A', B' possible of A and B, such that, A'i+B'i ≥ K for all i, where A'i denotes the ith element in the array A' and B'i denotes ith element in the array B'.
		
		Input Format
		The first line contains an integer, T, the number of test-cases. T test cases follow. Each test case has the following format:
		
		The first line contains two integers, N and K. The second line contains N space separated integers, denoting array A. The third line describes array B in a same format.
		
		Output Format
		For each test case, if such an arrangement exists, output "YES", otherwise "NO" (without quotes).
	 * 
	 */
	
	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		List<String> answers = new ArrayList<String>();
		
		for(int i = 0; i < T; i++) {
			
			int N = in.nextInt();
			int K = in.nextInt();
			
			List<Integer> A = new ArrayList<Integer>();
			List<Integer> B = new ArrayList<Integer>();
			
			for(int j = 0; j < N; j++) {
				A.add(in.nextInt());
			}
			
			for(int j = 0; j < N; j++) {
				B.add(in.nextInt());
			}
			
			A.sort((o1, o2) -> Integer.compare(o2, o1));
			B.sort((o1, o2) -> Integer.compare(o1, o2));
			
			int cnt = 0;
			for(int j = 0; j < N; j++) {
				if(A.get(j) + B.get(j) >= K) cnt++;
			}
			
			int idx = 0, dnt = 0;
			for(int j = N-1; j >=0; j--) {
				if(A.get(idx++) + B.get(j) >= K) dnt++;
			}
			
			answers.add((cnt == N || dnt == N)?"YES":"NO");
		}
		
		for(int i = 0; i < T; i++) {
			System.out.println( answers.get(i));
		}
		
		in.close();
	}
}