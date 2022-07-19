package easy;

public class Longest_Continuous_Increasing_Subsequence_674 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 3, 5, 4, 7};
		int result = 0, anchor = 0;
		for(int i =0; i<nums.length; i++) {
			if(i>0 && nums[i]<= nums[i-1])
				anchor = i;
			result = Math.max(result, i-anchor+1);

		}
		System.out.println(result);
	}

}
