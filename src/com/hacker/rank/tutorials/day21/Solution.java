package com.hacker.rank.tutorials.day21;

public class Solution {
	public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Solution.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }

	private static void printArray(Object[] array) {
		int len = array.length;
		for(int i = 0; i < len; i++) {
			System.out.println(array[i]);
		}
	}
}