package medium;

public class Max_Consecutive_Ones_III_1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2 ;
		int start = 0;
		int end =0;
		int countOne = 0;
		
		int currentMax = 0;
		int max = 0;
		
		if(nums.length == k) {
			System.out.println(k);
		}
		
		while(end<nums.length) {
		//	System.out.println( "sdsadsa   " +currentMax + " " + start + " " + end + " " + countOne);

			if(nums[end] == 1) {
				currentMax++;
				
				countOne++;
				System.out.println( "sdsadsa   " +currentMax + " " + start + " " + end + " " + countOne);
				end++;
			} else {
				System.out.println( "sdsadsa   " +currentMax + " " + start + " " + end + " " + countOne);
					
					while(end-start+1-countOne>k) {
						if (nums[start] == 1) {
							countOne--;
						}
						start++;
						currentMax--;
					}
					currentMax++;
					end++;

			}

		max = Math.max(currentMax, max);
			
		}
		
		System.out.println(max);
		
	}

}
