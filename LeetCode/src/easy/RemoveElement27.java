package easy;

public class RemoveElement27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {3,2,2,3};
		int val = 3;
		int c = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[c] = nums[i];
                c++;
                
            }
            
        }
        
        System.out.println(c);
	}

}
