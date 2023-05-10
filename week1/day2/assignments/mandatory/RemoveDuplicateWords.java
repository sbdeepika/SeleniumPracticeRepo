package week1.day2.assignments.mandatory;

public class RemoveDuplicateWords {

	 

    public static void main(String[] args) {

          // TODO Auto-generated method stub

         

          String str = "we learn java basics as part of java sessions in java week1";

          int count = 1;

          String[] sr1 =str.split(" ");

          for (int i = 0; i < sr1.length; i++) {

                 for (int j = i+1; j < sr1.length; j++) {

                       if(sr1[i].equals(sr1[j])) {                         

                       count = count+1;   

                       sr1[j] = "";

                       //System.out.println(count);                        

                       }                                            

                 }

                 if(count>1)

                       System.out.println(sr1[i]);                                      

          }

         

    }



}





