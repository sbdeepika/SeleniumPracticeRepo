package week3.day2.assignments;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "PayPal India";
		char[] ch = s.toCharArray();
		Set<Character> charSet  = new TreeSet<>();
		Set<Character> dupCharSet  = new TreeSet<>();
		
		for (int i = 0; i < ch.length; i++) {
			boolean add =  charSet.add(ch[i]);
			
			if(!add) {
				dupCharSet.add(ch[i]);
			}
			
				}
		System.out.println(charSet);
		System.out.println(dupCharSet);

//		if(charSet.contains(dupCharSet)) {
//			charSet.remove(dupCharSet);
//		}
			
		charSet.removeAll(dupCharSet);
		System.out.println(charSet);
		System.out.println(dupCharSet);

		Iterator<Character> Value = charSet.iterator();
		while(Value.hasNext()) {
			char cha = Value.next();
			if(cha != ' ') {
				System.out.println(cha);
			}
		}
		
	}

}
