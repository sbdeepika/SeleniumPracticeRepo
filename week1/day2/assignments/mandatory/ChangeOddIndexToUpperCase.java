package week1.day2.assignments.mandatory;


public class ChangeOddIndexToUpperCase {


       public static void main(String[] args) {

             // TODO Auto-generated method stub

             String str = "changeme", str1;

             System.out.println(str);            

             for(int i=0; i<str.length();i++) {

                    char ch = str.charAt(i);

                    if(i%2==0) {

                          System.out.println(Character.toLowerCase(ch));

                    }      else {                   

                          System.out.println(Character.toUpperCase(ch));
                         
                    }
             }                   

       } 

}

 

