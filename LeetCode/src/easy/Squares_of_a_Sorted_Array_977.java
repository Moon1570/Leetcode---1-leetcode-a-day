package easy;

import java.util.Iterator;

public class Squares_of_a_Sorted_Array_977 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {-4,-1,0,3,10};
		
		int[] res = new int[nums.length];
		
		int start = 0;
		int end = nums.length-1;
		for(int i=0; i<nums.length; i++)
		{
			if(Math.abs(nums[start])>Math.abs(nums[end])) {
				res[res.length - i - 1] = nums[start] * nums[start];
				start++;
			} else {
				res[res.length - i - 1] = nums[end] * nums[end];
				end--;
			}
		}
		System.out.println(res);
	}

}
