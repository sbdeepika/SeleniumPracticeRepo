package week1.day1;

public class Fibbinocci {
    public static void main(String args[]) {
      int firstNum =0, secNum =1, sum =0, count =11;
     

      System.out.println(firstNum);
      
      for(int i=1;i<=count;i++){
          sum = firstNum+ secNum;
          firstNum = secNum;
          secNum = sum;
          System.out.println(sum);
          
      }
    }
}