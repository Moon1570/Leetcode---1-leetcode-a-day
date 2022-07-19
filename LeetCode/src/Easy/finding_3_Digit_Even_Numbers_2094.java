package Easy;

import java.util.Arrays;
import java.util.HashSet;

public class finding_3_Digit_Even_Numbers_2094 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] digits = {2, 1, 3, 0};
		boolean[] visited = new boolean[digits.length];
        HashSet<Integer> hashset =new HashSet<>();
        for(int i =0 ; i< digits.length ;i++) { 
            if(digits[i] == 0) {
                continue;
            }
            for(int j = 0; j < digits.length ;j++) {
                if(j == i) {
                    continue;
                }
                for(int k =0; k < digits.length ;k++) {
                    if(k == i || k == j) continue;
                    if(digits[k]%2 == 0) {
                        hashset.add(digits[i]*100 + digits[j]*10 + digits[k]);
                    }
                }
            }
        }
        int[] b = new int[hashset.size()];
        int count =0;
        for(int n : hashset) {
            b[count++] = n;
        }
        Arrays.sort(b);
        
	}

}
