package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] nums = {7,3,2,4,6,1,6,9,10};
		Set<Integer> num = new TreeSet<>();
for (int i = 0; i < nums.length; i++) {
		num.add(nums[i]);			
			
		}
		List<Integer> no = new ArrayList<>(num);
		for (int i = 0; i < no.size()-1; i++) {
			if(no.get(i) == no.get(i+1)-1) {
			continue;
			}else {
				System.out.println("Missing Number" + no.get(i));
			}
		}
		

	}

}
