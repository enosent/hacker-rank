package com.hacker.rank.tutorials.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	List<Character> stack = new ArrayList<Character>();
	List<Character> queue = new ArrayList<Character>();
	
	public void pushCharacter(char c) {
		stack.add(c);
	}
	
	public void enqueueCharacter(char c) {
		queue.add(c);
	}

	private char popCharacter() {
		return stack.remove(0);
	}
	
	private char dequeueCharacter() {
		return queue.remove(queue.size() - 1);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		Solution p = new Solution();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length/2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;                
				break;
			}
		}

		//Finally, print whether string s is palindrome or not.
		System.out.println( "The word, " + input + ", is " 
				+ ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
	}

}
