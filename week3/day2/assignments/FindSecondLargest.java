package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> nums = new TreeSet<>();
		for (int i = 0; i < data.length; i++) {
			nums.add( data[i]);
			
		}
		
		List<Integer> num = new ArrayList<>(nums);
		System.out.println(num.get(num.size()-2));
	}

}
