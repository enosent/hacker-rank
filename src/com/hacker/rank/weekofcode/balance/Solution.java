package com.hacker.rank.weekofcode.balance;

import java.util.*;

/**
 * Created by enosent on 2016. 6. 28..
 */
public class Solution {
	
	/*
	 * 문제가 잘 이해는 안됨 ..
	 * 
	 * 대략적으로 이해한거 정리하면
	 * 
	 * K 는 중요 경기 수, T(i) 가 1이면 중요, 0이면 패스
	 * 
	 * T(i)가 1인 경기 중 최소 K는 질 수 있음 ( 지면 Luck balance 증가, 이기면 감소 ), 나머지 T(i) 는 이긴거로 처리 .
	 * 
	 * 진 경기 ( L(i) ) 총합에서 이긴 경기 ( L(i) ) 값을 뺀 결과가 max 인거 .. 즉 L(i) 가 최소인거를 찾으면 됨.
	 * 
	 * 단, K이상은 질 수 없으니까 .. 1인 경기 중 K 값을 뺀 나머지가 이겨야하니까 최소순으로 정렬 후 제외처리
	 * 
	 * 문제는 K..가 0, 중요경기가 최소 질 수 있는 건수보다 작은 경우인데 .. 이 경우는 다 이겼다로 처리해서 전체 마이너스 합으로 반환
	 * 
	 * 
	 * https://www.hackerrank.com/contests/w21/challenges/luck-balance
	 */

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        int[] L = new int[N];
        int[] T = new int[N];
        for(int i = 0; i < N; i++) {
            L[i] = in.nextInt();
            T[i] = in.nextInt();
        }

        if ( K != 0) {
        	
        	List<Integer> importants = new ArrayList<Integer>();
        	
        	int result = 0;
        	for(int i = 0; i < N; i++) {
        		if(T[i] == 1) {
        			importants.add( L[i] );
        		} else {
        			result += L[i];
        		}
        	}
        	
        	importants.sort((o1, o2) -> Integer.compare(o1, o2));
        	
        	int len = importants.size();
        	int size = len - K;
        	
        	if( size > 0) {
        		int win = 0;
        		for(int i = 0; i < size; i++) {
        			win += importants.get(i);
        		}
        		
        		int lose = 0;
        		for(int i = size; i < len; i++) {
        			lose += importants.get(i);
        		}
        		
        		System.out.println( result + lose - win );
        	} else {
            	for(int i = 0; i < N; i++) {
            		result -= L[i];
            	}
            	
            	System.out.println( result );
        	}
        	
        	
        } else {
        	int result = 0;
        	
        	for(int i = 0; i < N; i++) {
        		result -= L[i];
        	}
        	
        	System.out.println( result );
        }
        
        in.close();
    }
}