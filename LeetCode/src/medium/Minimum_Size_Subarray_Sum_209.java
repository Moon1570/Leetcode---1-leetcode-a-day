package medium;

public class Minimum_Size_Subarray_Sum_209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,3,1,2,4,3};
		int target = 7;
		
		int minSubArray = 0;
		
		int sum = 0;
		int j = 0;
		
		for(int i = 0; i< nums.length; i++) {
			
			sum += nums[i];
			
			if (sum>=target) {
				
				while(sum>=target) {
                    if (minSubArray == 0) minSubArray =i-j+1;
					minSubArray = Math.min(i-j+1, minSubArray);
					sum -= nums[j];
					j++;
				}
			}
			
			System.out.println(minSubArray);
		}
		
	}

}
