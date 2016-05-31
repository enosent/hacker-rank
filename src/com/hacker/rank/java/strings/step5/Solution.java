package com.hacker.rank.java.strings.step5;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		//Complete the code

		s = s.trim();

		if(s.length() == 0) {
			System.out.println(0);
		} else {

			String[] split = s.trim().split("[_\\@ !,?.']+");

			System.out.println(split.length);

			for(int i = 0; i < split.length; i++) {
				System.out.println(split[i]);
			}
		}

		scan.close();
	}
}