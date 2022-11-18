package medium;

import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class P_3Sum_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {-1,0,1,2,-1,-4};
		int need = 0;
		int target = 0;
		Set<List<Integer>> res = new HashSet<List<Integer>>();
		
		for (int i=0; i<nums.length; i++)
		{
			target = 0 - nums[i];
			
			for(int j=i; j<nums.length; j++) {
				if(i==j) {
					continue;
				} else  {
					need = target - nums[j];
					for(int k = j; k<nums.length; k++) {
						if(i==j || j==k || i==k) {
							continue;
						}
						else {
							if(nums[k] == need) {
								res.add(Arrays.asList(nums[i], nums[j], nums[k]));
							}
						}
					}
					
				}
			}
			
		}
		
		System.out.println(res);
	}

}
