package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String array[] = {"CTS","Aspire","Wipro","HCL"};
		
		List<String> cmpy = new ArrayList<>();
		
		for (int i = 0; i < array.length; i++) {
			cmpy.add(array[i]);
			
		}
		
		Collections.sort(cmpy);
		for (int i = cmpy.size() -1; i>= 0; i--) {
			
			System.out.println(cmpy.get(i));
			
		}
	}

}
