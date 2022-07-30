package medium;

import java.util.HashMap;
import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcabcbb";
		
HashSet<Character> hs = new HashSet<Character>();
		
		int start = 0;
		int end = 0;
		int max = 0;
		
		 while(end<s.length()){
            if(!hs.contains(s.charAt(end))){
                hs.add(s.charAt(end));
                end++;
                max= Math.max(hs.size(),max);
            }else{
                hs.remove(s.charAt(start));
                start++;
            }
        }
        System.out.println(max);
	}

}
