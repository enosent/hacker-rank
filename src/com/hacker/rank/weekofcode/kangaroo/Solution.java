package com.hacker.rank.weekofcode.kangaroo;

import java.util.Scanner;

/**
 * Created by enosent on 2016. 6. 28..
 */
public class Solution {
	
	/*
	 * Note: The two kangaroos must land at the same location after making the same number of jumps.
	 * 
	 * .. 수학 다 까먹었네 ㅡㅡ;;
	 * 
	 * same number of jumps!!
	 * 
	 * 방정식 문제였어 ㅡㅡ;
	 * 
	 * x1 + v1*Jump = x2 + v2*Jump
	 *  > x1 - x2 = v2*Jump - v1*Jump
	 *  > x1 - x2 = (v2 - v1)*Jump
	 *  > Jump = (x1 - x2) / (v2 - v1)
	 * 
	 * Jump = (x1 - x2) / (v2 - v1) 이 값이 0으로 떨어지는 것이 .. YES인 ..
	 */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        if(x1 > x2 && v1 > v2) {
            System.out.println("NO");
        } else if(x2 > x1 && v2 > v1) {
            System.out.println("NO");
        } else if(x1 != x2 && v1 == v2){
            System.out.println("NO");
        } else{
        	if(v2 - v1 == 0) {
        		System.out.println("NO");	
        	} else if( (x1-x2)%(v2-v1) == 0 ){
        		System.out.println("YES");
            } else {
            	System.out.println("NO");
            }
        }
        in.close();
    }
}
