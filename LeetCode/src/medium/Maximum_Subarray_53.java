package medium;

public class Maximum_Subarray_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int maxSum = nums[0];
		int currentSum = 0;
		
		
		for(int i=0; i<nums.length; i++) {
			
			currentSum = currentSum + nums[i];
			
			if(currentSum<nums[i]) {
				currentSum = nums[i];
			}
			maxSum = Math.max(maxSum, currentSum);

			System.out.println(maxSum);

		}
		
	}

}
