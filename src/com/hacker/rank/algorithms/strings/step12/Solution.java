package com.hacker.rank.algorithms.strings.step12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// 참조 : http://stackoverflow.com/questions/29191565/find-the-number-of-unordered-anagramic-pairs-of-substrings/36235287
public class Solution {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	int T = in.nextInt();
    	
    	String[] keywords = new String[T];
    	for(int i = 0; i < T; i++) {
    		keywords[i] = in.next();
    	}
    	
    	
    	for(int idx = 0; idx < T; idx++) {
    		String keyword = keywords[idx];
    		
    		int count = anagramCount(keyword);
    		System.out.println(count);    	
    	}
    	
    	
    	in.close();
    }
    
    static int anagramCount(String keyword) {
    	Map<Integer, List<String>> results = new HashMap<Integer, List<String>>();
    	
    	int len = keyword.length();
    	
    	for(int i = 1; i < len; i++) {
    	
    		List<String> subStr = new ArrayList<String>();
    		for(int j = 0; j < len -i+1 ; j++) {
    			String substring = keyword.substring(j, j+i);
    			subStr.add( substring );
    		}
    		
    		results.put(i, subStr);
    	}
    	
    	int count = 0;
    	
    	for(int i = 1; i < len; i++) {
    		List<String> list = results.get(i);
    		
    		int size = list.size();
    		for(int ix = 0; ix < size; ix++) {
    			
    			for(int jx = ix+1; jx < size; jx++) {
    				
    				//System.out.println("("+ix+") "+ list.get(ix) +", "+ "("+jx+") "+ list.get(jx) );
    				
    				if(isAanagram(list.get(ix), list.get(jx))){
    					count++;
    				}
    			}
    		}
    	}
    	
    	return count;
    }

	static boolean isAanagram(String o1, String o2) {
		if(o1.length() != o2.length()) {
			return false;
		} else {
			char[] array1 = o1.toCharArray();
			char[] array2 = o2.toCharArray();
			
			Arrays.sort(array1);
			Arrays.sort(array2);
			
			int len = array1.length;
			for(int i = 0; i < len; i++) {
				if(array1[i] != array2[i]){
					return false;
				}
			}
			
			return true;
		}
	}
    
    
}