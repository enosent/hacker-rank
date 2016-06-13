package com.hacker.rank.tutorials.day28;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Map<String, String> users = new HashMap<String, String>();
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		while(N-->0){
			String name = in.next();
			String id = in.nextLine();
			
			if(id.endsWith("@gmail.com")){
				users.put(id, name);
			}
		}
		
		List<String> collect = users.values().stream().sorted().collect(Collectors.toList());
		collect.forEach(System.out::println);
		
		in.close();
	}
}