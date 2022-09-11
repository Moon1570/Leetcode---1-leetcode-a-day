	package hard;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Window_Substring_76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ADOBECODEBANC";
		String t = "ABC";
		
		if(s == null || t == null || s.isEmpty() || t.isEmpty() || s.length() < t.length()) System.out.println(false);
        
        Map<Character, Integer> need = new HashMap<>();
        //Map<Character, Integer> window = new HashMap<>();
        
        for (char tc : t.toCharArray()){
            need.put(tc, need.getOrDefault(tc, 0)+1);
        }
        
        
        int left = 0, right = 0, valid = need.size(), start = 0, len = Integer.MAX_VALUE;
        while (right < s.length()) {
            
            char rc = s.charAt(right);
            
            right++;
            
            if (need.containsKey(rc)) {
                
				//update the map, reduce the quantity by 1 if detect one qualified character
                need.put(rc, need.get(rc)-1);
                
                if (need.get(rc).equals(0)) valid--;
                
            }
            
            //if (valid > 0) continue;
            while (valid == 0) {
                
                if (right - left < len) {
                    start = left;
                    len = right - left;
                    
                }
                char lc = s.charAt(left);
                
                left++;
                
                if (need.containsKey(lc)) {
                    
                    if (need.get(lc).equals(0)){
                        valid++;
                    }
                    need.put(lc, need.get(lc)+1);
                }
                
            }
        }
        if (len == Integer.MAX_VALUE)
			System.out.println(false);
		else
			System.out.println(s.substring(start, start+len));
	}

}
