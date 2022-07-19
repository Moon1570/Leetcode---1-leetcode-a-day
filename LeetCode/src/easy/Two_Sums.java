package easy;

import java.util.HashMap;
import java.util.Iterator;

public class Two_Sums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 4};
		int target = 5;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                 System.out.println(map.get(complement)+ "  "+ i );
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
		
		System.out.println(map.get(2));
	}

}
