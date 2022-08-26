package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Find_All_Anagrams_in_a_String_438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abacbabc";
		String p = "abc";
		
		List<Integer> res=new ArrayList<>();
	    if(p.length()>s.length())System.out.println(false);;
	    int n=p.length(),m=s.length();
	    int freq[]=new int[26];

	    for(int i=0;i<n;i++){
	        freq[p.charAt(i)-'a']++;
	        freq[s.charAt(i)-'a']--;
	    }
	    if(isValid(freq)) res.add(0);

	    for(int i=n;i<m;i++){
	        freq[s.charAt(i-n)-'a']++;
	        freq[s.charAt(i)-'a']--;
	        if(isValid(freq)) res.add(i-n+1);
	    }
	    System.out.println(res);
	    
	}

	public static boolean isValid(int freq[]){
	    for(int i=0;i<26;i++){
	        if(freq[i]!=0) return false;
	    }
	    return true;
	}
}
