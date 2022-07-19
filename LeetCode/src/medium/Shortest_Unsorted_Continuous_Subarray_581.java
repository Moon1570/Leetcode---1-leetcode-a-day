package medium;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Shortest_Unsorted_Continuous_Subarray_581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,3,2,2,2};
		
        int b[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            b[i] = nums[i];
		
		Arrays.sort(b);
		
		int left = 0;
		int right = b.length-1;

		
		while(left<right) {
			if(b[left] == nums[left]) {
				left++;
				System.out.println(b[left] + "ges" + nums[left]);
			}
			else if(b[right] == nums[right]) {
				right--;
			}
			else {
				System.out.println(right - left + 1 );
				break;
			}
		}
	}

}
