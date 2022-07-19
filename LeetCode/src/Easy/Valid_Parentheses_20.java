package Easy;

import java.util.Stack;

public class Valid_Parentheses_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "()[{(}()}]";
	
		if(s.length() == 0 || s.length()%2 != 0) {
			System.out.println(false);;
		}
		
		Stack<Character> st = new Stack<>();
		for (int i =0; i< s.length(); i++) {
			if(s.charAt(i) == '(' || 
					s.charAt(i) == '{' ||
					s.charAt(i) == '[') 
			{
				st.push(s.charAt(i));
			}	
			else {
				if (st.isEmpty()) {
					System.out.println(false);
				}
				
				if (st.peek() == '(' && s.charAt(i) == ')') {
					st.remove(st.lastIndexOf(st.peek()));
				}
				else if (st.peek() == '{' && s.charAt(i) == '}') {
					st.remove(st.lastIndexOf(st.peek()));
				}
				else if (st.peek() == '[' && s.charAt(i) == ']') {
					st.remove(st.lastIndexOf(st.peek()));
				}
				else System.out.println(false);
			}
		}
		
		if (st.isEmpty()) {
			System.out.println(true);
		}else System.out.println(false);
	}

}
