package medium;

import java.util.HashMap;


public class Fruit_Into_Baskets_904 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] fruits = {1,2,3,2,2};
		

		int lastFruit = -1;
		int secondLastFruit = -1;
		int lastFruitCount = 0;
		int currentMax = 0;
		int max = 0;
				
		for(Integer fruit:fruits) {
			
			
			if (fruit == lastFruit || fruit == secondLastFruit) {
				currentMax++;
			}
			else {
				currentMax = lastFruitCount + 1;
			}
			
			
			if (fruit == lastFruit) {
				lastFruitCount++;
			}
			else
				lastFruitCount = 1;
			
			if (fruit!= lastFruit) {
				secondLastFruit = lastFruit;
				lastFruit = fruit;
			}
			
			max = Math.max(currentMax, max);
		}
		
		
		System.out.println(max);
	}

}
