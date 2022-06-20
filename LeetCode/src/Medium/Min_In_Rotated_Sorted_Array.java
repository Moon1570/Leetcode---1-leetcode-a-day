package Medium;

public class Min_In_Rotated_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,1};
		
		if(nums.length == 0) {
			System.out.println(-1);
		}
		if(nums.length == 1) {
			System.out.println(nums[0]);
		}
		
		
		int left = 0;
		int right = nums.length - 1;
		
		while(left<right) {
			int mid = left + (right - left)/2;
			
			if(mid > 0 && nums[mid] < nums[mid-1]) {
				System.out.println(nums[mid]);
			} else if(nums[left] <= nums[mid] && nums[mid] > nums[right]) {
				left = mid + 1;
			} else right = mid -1;
		}
		System.out.println(nums[left]);
	}

}
