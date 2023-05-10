package week1.day2.assignments.mandatory;

public class Palindrome {

	 

    public static void main(String[] args) {

          // TODO Auto-generated method stub

          String str = "madam", rev="";

          System.out.println("Original String "+ str);

          char[] str1 = str.toCharArray();

          for(int i = str.length()-1;i>= 0;i--) {

                 rev = rev+ str1[i];      

                 }

          System.out.println("Reversed string" + rev);

          if(rev.equals(str)) {

                 System.out.println("Given String is a Palindrome");

          }else {

                 System.out.println("Given String is not a Palindrome");

          }
    }

}





