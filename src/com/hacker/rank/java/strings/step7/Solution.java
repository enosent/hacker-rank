package com.hacker.rank.java.strings.step7;

import java.util.Scanner;

class myRegex {
	public final String pattern = "^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$";
}

public class Solution {
	
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new myRegex().pattern));
		}

		in.close();
	}
}
/*
12.12.12.12
13.13.13.112
VUUT.12.12
111.111.11.111
1.1.1.1.1.1.1
.....
1...1..1..1
0.0.0.0
255.0.255.0
266.266.266.266
00000.000000.0000000.00001
0023.0012.0012.0034
*/