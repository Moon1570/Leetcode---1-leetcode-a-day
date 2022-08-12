package hard;

public class Median_of_Two_Sorted_Arrays_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1 = {1, 2};
		int[] nums2 = {3, 4};
		int length = nums1.length + nums2.length; 
		int [] newArray = new int[length];
		
		int i = 0,  j=0;
		
		for(int k = 0; k<length; k++) {
			if(nums1.length-1<i && nums2.length-1>=j) {
				newArray[k] = nums2[j];
				j++;
			}
			else if(nums1.length-1>=i && nums2.length-1<j) {
				newArray[k] = nums1[i];
				i++;
			}
			else if (nums2[j]>nums1[i]) {
				newArray[k] = nums1[i];
				i++;
			} else {
				newArray[k] = nums2[j];
				j++;
			}
		}
		
		double median;
		if(length%2 ==0) {
			median = (double)(newArray[length/2] + newArray[length/2 -1]) / 2;
		} else {
			median = newArray[length/2];
		}
		System.out.println(median);
	}

}
