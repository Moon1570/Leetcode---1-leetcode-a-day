package medium;

import java.util.HashMap;

public class Permutation_in_String_567 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "hello";
		String s2 = "ooolleoooleh";
		
		HashMap<Character, Integer> s1Hash = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s1.length(); i++) {
				s1Hash.put(s1.charAt(i), s1Hash.getOrDefault(s1.charAt(i),0)+1);
			 }
		
		System.out.println(s1Hash);
		int start = 0;
		int end = s1.length()-1;
		
		while(end<s2.length()) {
			HashMap<Character, Integer> temp = new HashMap<Character, Integer>();
			
			for(int i=start; i<=end; i++) {
				temp.put(s2.charAt(i), temp.getOrDefault(s2.charAt(i),0)+1);
			}
			
			
			if (s1Hash.equals(temp)) {
				System.out.println(temp);
				System.out.println(true);
				break;
			}
			end++;
			start++;
		}
		System.out.println(false);
		
	}

}
