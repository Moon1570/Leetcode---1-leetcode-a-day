package medium;

public class ProductOfArrayExceptSelf_238 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		int[] res = new int[nums.length];
		res[0] = 1;
		
		for(int i=1; i<=nums.length-1; i++) {
			res[i] = res[i-1]*nums[i-1];
		}
		
		int right = 1;
		for(int j=nums.length-1; j>=0; j--) {
			res[j] = res[j]*right;
			right = right * nums[j];
		}
		
		for(int j=0; j<nums.length; j++) {
			System.out.println("res "+ j + " => " + res[j]);
		}
		
	}

}
