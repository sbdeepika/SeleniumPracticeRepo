package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;



public class PrintUniqueCharacter {
	
	
	public static void main(String[] args) {
	
		String name  = "Deepika";
		char[] ch = name.toCharArray();
	
		
		Set<Character> uniqueChar = new HashSet<>();
		for(int i =0 ; i< ch.length;i++ ) {
			uniqueChar.add(ch[i]);
		}
		System.out.println(uniqueChar);
	}
	
	
	
}

