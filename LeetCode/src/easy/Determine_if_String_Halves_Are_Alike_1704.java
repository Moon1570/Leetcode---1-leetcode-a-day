package easy;

public class Determine_if_String_Halves_Are_Alike_1704 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "book";
		
		int len =  s.length();

		int count1=0;
		int count2 =  0;
		for(int i=0, j=len-1; i<len/2; i++, j--) {
			System.out.println(j);
			if(s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E'|| 
					s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'u' || s.charAt(i) == 'U') {
				count1++;
			}
			if(s.charAt(j) == 'o' || s.charAt(j) == 'O' || s.charAt(j) == 'a' || s.charAt(j) == 'A' || s.charAt(j) == 'e' || s.charAt(j) == 'E'|| 
					s.charAt(j) == 'i' || s.charAt(j) == 'I' || s.charAt(j) == 'u' || s.charAt(j) == 'U') {
				count2++;
			}
		}
		
		if(count1 == count2)
			System.out.println(true);
		else System.out.println(false);
	}

}
