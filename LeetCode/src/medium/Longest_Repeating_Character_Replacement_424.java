package medium;

import java.util.HashMap;

public class Longest_Repeating_Character_Replacement_424 {

	public static void main(String[] args) {
		String s = "AABABBA";
		int k = 1;
		int[] charCount = new int[26];
		int start = 0;
		int max = 0;
		int currentMax = 0;
		
		for(int end = 0; end < s.length(); end++) {
			charCount[s.charAt(end)-'A']++;
			int currentCharCount = charCount[s.charAt(end)-'A'];
			currentMax = Math.max(currentMax, currentCharCount);
			
			while(end - start - currentMax + 1 > k) {
				charCount[s.charAt(start)-'A']--;
				start++;
			}
			max = Math.max(max, end-start+1);
		}
		System.out.println(max);
	}
}
