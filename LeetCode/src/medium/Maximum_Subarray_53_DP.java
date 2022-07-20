package medium;

public class Maximum_Subarray_53_DP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int curr = 0;
        	int max = Integer.MIN_VALUE;
			int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
	    	for(int num: nums) {
	             // Same as DP[i] = Math.max(DP[i-1] + num, num);
	    	curr = Math.max(curr + num, num); 
	    	max = Math.max(max, curr);
	    }
	    System.out.println(max);
	}
}

