package week1.day2.assignments.mandatory;

public class ReverseEvenWords {

	 

    public static void main(String[] args) {

          // TODO Auto-generated method stub

          String str = "I am a software tester",rev ="";

          String[] str1 = str.split(" ");

          for (int i = 0; i < str1.length; i++) {

                 //System.out.println(i);

                 if(i%2!=0) {

                       char[] ch = str1[i].toCharArray();

                       //System.out.println(ch);

                       for (int j = ch.length-1 ; j >=0; j--) {

                              rev = rev+ ch[j];              

                              }

                       System.out.print(rev+" ");

                       rev ="";

                 }else {

                       System.out.print(str1[i]+" ");

                 }           

                

          }

    }



}




