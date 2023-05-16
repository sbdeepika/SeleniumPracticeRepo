package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";
		String[] words = text.split(" ");
		Set<String> uniqueWords = new LinkedHashSet<>();
		for (int i = 0; i < words.length; i++) {
			uniqueWords.add(words[i]);
		}
		
		System.out.println(uniqueWords);
		String[] myArray = new String[uniqueWords.size()];
		uniqueWords.toArray(myArray);
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
	}

}
