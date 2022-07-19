package easy;

public class Binary_Search_704 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {5, 6};
		int target = 5;
		int left = 0;
        int right = nums.length -1;
        
        while(left<=right){
            int middle = (left + right)/2;
            
            if(target < nums[middle]){
                right = middle-1;
            } 
            else if(target > nums[middle]){
                left = middle+1;
            }
            else if (target == nums[middle]){
                System.out.println(middle);
            }
        }
        System.out.println(-1);
	}

}
